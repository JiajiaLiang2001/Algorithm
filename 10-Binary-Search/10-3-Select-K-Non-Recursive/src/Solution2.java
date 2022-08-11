/// 面试题 17.14. 最小K个数
/// https://leetcode.cn/problems/smallest-k-lcci/

import java.util.Arrays;
import java.util.Random;

public class Solution2 {
    public int[] smallestK(int[] nums, int k) {
        if (k == 0) return new int[0];
        Random rnd = new Random();
        selectK(nums, 0, rnd);
        return Arrays.copyOf(nums, k);
    }

    private int selectK(int[] nums, int k, Random rnd) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int p = partition(nums, l, r, rnd);
            if (k == p) return nums[p];
            if (k < p) r = p - 1;
            else l = p + 1;
        }
        throw new RuntimeException("No Solution");
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
