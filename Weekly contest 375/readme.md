# 10031. Count Tested Devices After Test Operations 

You are given a 0-indexed integer array batteryPercentages having length n, denoting the battery percentages of n 0-indexed devices.

*Your task is to test each device i in order from 0 to n - 1, by performing the following test operations:*

- If batteryPercentages[i] is greater than 0:
   - Increment the count of tested devices.
   - Decrease the battery percentage of all devices with indices j in the range [i + 1, n - 1] by 1, ensuring their battery percentage never goes below 0, i.e, batteryPercentages[j] = max(0, batteryPercentages[j] - 1).
   - Move to the next device.
Otherwise, move to the next device without performing any test.
> Return an integer denoting the number of devices that will be tested after performing the test operations in order.

## Example 1

```bash
Input: batteryPercentages = [1,1,2,1,3]
Output: 3
Explanation: Performing the test operations in order starting from device 0:
At device 0, batteryPercentages[0] > 0, so there is now 1 tested device, and batteryPercentages becomes [1,0,1,0,2].
At device 1, batteryPercentages[1] == 0, so we move to the next device without testing.
At device 2, batteryPercentages[2] > 0, so there are now 2 tested devices, and batteryPercentages becomes [1,0,1,0,1].
At device 3, batteryPercentages[3] == 0, so we move to the next device without testing.
At device 4, batteryPercentages[4] > 0, so there are now 3 tested devices, and batteryPercentages stays the same.
So, the answer is 3.
```

## Example 2

```bash
Input: batteryPercentages = [0,1,2]
Output: 2
Explanation: Performing the test operations in order starting from device 0:
At device 0, batteryPercentages[0] == 0, so we move to the next device without testing.
At device 1, batteryPercentages[1] > 0, so there is now 1 tested device, and batteryPercentages becomes [0,1,1].
At device 2, batteryPercentages[2] > 0, so there are now 2 tested devices, and batteryPercentages stays the same.
So, the answer is 2.
```

## Solution (Java)

```python
class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] > 0) {
                for (int j = i + 1; j < batteryPercentages.length; j++) {
                    batteryPercentages[j] = Math.max(0, batteryPercentages[j] - 1);
                }
                count++;
            }
        }
        return count;
    }
}
```

# 2962. Count Subarrays Where Max Element Appears at Least K Times 

> - You are given an integer array nums and a positive integer k.
> - Return the number of subarrays where the maximum element of nums appears at least k times in that subarray.
> - A subarray is a contiguous sequence of elements within an array.



## Example 1

```bash
Input: nums = [1,3,2,3,3], k = 2
Output: 6
Explanation: The subarrays that contain the element 3 at least 2 times are: [1,3,2,3], [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3] and [3,3].
```

## Example 2

```bash
Input: nums = [1,4,2,1], k = 3
Output: 0
Explanation: No subarray contains the element 4 at least 3 times.
```
## Constraints:
> - 1 <= nums.length <= 105
> - 1 <= nums[i] <= 106
> - 1 <= k <= 105

## Solution (Java)

```python
import java.util.Arrays;

class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans = 0;
        int maxNum = Arrays.stream(nums).max().getAsInt();
        int[] prefixSum = new int[maxNum + 1];
        int count = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            prefixSum[nums[right]]++;

            if (nums[right] == maxNum) {
                count++;
            }

            while (count >= k) {
                ans += nums.length - right;
                prefixSum[nums[left]]--;
                if (nums[left] == maxNum) {
                    count--;
                }
                left++;
            }
        }

        return ans;
    }
}

```
