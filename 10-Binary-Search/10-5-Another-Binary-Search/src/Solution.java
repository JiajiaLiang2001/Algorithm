/// Leetcode 704. Binary Search
/// https://leetcode.cn/problems/binary-search/

public class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            if (target == nums[mid]) return mid;
            if (target > nums[mid]) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
}
