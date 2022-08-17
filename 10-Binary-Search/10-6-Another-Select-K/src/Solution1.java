/// Leetcode 215. Kth Largest Element in an Array
/// https://leetcode-cn.com/problems/kth-largest-element-in-an-array/

import java.util.Random;

/**
 * recursive version
 * selectK : [l,r)
 * partition : [l,r]
 */
public class Solution1 {
    public int findKthLargest(int[] nums, int k) {
        Random rnd = new Random();
        return selectK(nums, 0, nums.length, nums.length - k, rnd);
    }

    private int selectK(int[] nums, int l, int r, int k, Random rnd) {
        int p = partition(nums, l, r - 1, rnd);
        if (k == p) return nums[p];
        if (k < p) return selectK(nums, l, p, k, rnd);
        return selectK(nums, p + 1, r, k, rnd);
    }

    private int partition(int[] nums, int l, int r, Random rnd) {
        int p = l + rnd.nextInt(r - l + 1);
        swap(nums, l, p);
        // nums[l+1...i-1] <= v; nums[j+1...r] >= v
        int i = l + 1, j = r;
        while (true) {
            while (i <= j && nums[i] < nums[l])
                i++;
            while (j >= i && nums[j] > nums[l])
                j--;
            if (i >= j) break;
            swap(nums, i++, j--);
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
