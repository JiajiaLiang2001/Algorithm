/// Leetcode 704. Binary Search
/// https://leetcode.cn/problems/binary-search/

public class Solution {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length, target);
    }

    private int search(int[] nums, int l, int r, int target) {
        if (l >= r) return -1;
        int mid = (r - l) / 2 + l;
        if (target == nums[mid]) return mid;
        else if (target > nums[mid]) return search(nums, mid + 1, r, target);
        else return search(nums, l, mid, target);
    }
}
