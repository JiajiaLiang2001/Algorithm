/// Leetcode 75. Sort Colors
/// https://leetcode.cn/problems/sort-colors/

public class Solution {
    public void sortColors(int[] nums) {
        // nums[0...zero] == 0
        // nums[zero + 1, i] == 1,
        // nums[two,nums.length - 1] == 2

        int zero = -1, i = 0, two = nums.length;
        while (i < two)
            if (nums[i] == 0)
                swap(nums, ++zero, i++);
            else if (nums[i] == 2)
                swap(nums, i, --two);
            else
                i++;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
