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