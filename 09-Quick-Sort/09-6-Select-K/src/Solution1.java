/// Leetcode 215. Kth Largest Element in an Array
/// https://leetcode-cn.com/problems/kth-largest-element-in-an-array/

import java.util.Arrays;
import java.util.Random;

public class Solution1 {
    public int findKthLargest(int[] nums, int k) {
        Random rnd = new Random();
        return selectK(nums, 0, nums.length - 1, nums.length - k, rnd);
    }

    private int selectK(int[] nums, int l, int r, int k, Random rnd) {
        int p = partition(nums, l, r, rnd);
        if (k == p) return nums[p];
        if (k < p) return selectK(nums, l, p - 1, k, rnd);
        return selectK(nums, p + 1, r, k, rnd);
    }

    private int partition(int[] nums, int l, int r, Random rnd) {
        int p = l + rnd.nextInt(r - l + 1);
        swap(nums, l, p);
        // arr[l+1...i-1] <= v; arr[j+1...r] >= v
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
