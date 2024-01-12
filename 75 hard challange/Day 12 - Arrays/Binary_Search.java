

public class Binary_Search {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int median = left + (right - left) / 2;

            if (nums[median] == target) {
                return median;
            }

            if (nums[median] < target) {
                left = ++median;
            } else {
                right = --median;
            }
        }

        return -1;
    }
}
