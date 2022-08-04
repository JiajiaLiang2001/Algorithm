/// Leetcode 剑指 Offer 51. 数组中的逆序对
/// https://leetcode.cn/problems/shu-zu-zhong-de-ni-xu-dui-lcof/

public class Solution {
    public int reversePairs(int[] nums) {
        int[] temp = new int[nums.length];
        return mergeSort(nums, 0, nums.length - 1, temp);
    }

    private int mergeSort(int[] nums, int l, int r, int[] temp) {
        if (l >= r)
            return 0;
        int mid = l + (r - l) / 2;
        int res = 0;
        res += mergeSort(nums, l, mid, temp);
        res += mergeSort(nums, mid + 1, r, temp);
        if (nums[mid] > nums[mid + 1])
            res += merge(nums, l, mid, r, temp);
        return res;
    }

    private int merge(int[] nums, int l, int mid, int r, int[] temp) {
        System.arraycopy(nums, l, temp, l, r - l + 1);
        int i = l, j = mid + 1, res = 0;
        for (int k = l; k <= r; k++) {
            if (i > mid)
                nums[k] = temp[j++];
            else if (j > r)
                nums[k] = temp[i++];
            else if (temp[i] <= temp[j])
                nums[k] = temp[i++];
            else {
                res += mid - i + 1;
                nums[k] = temp[j++];
            }
        }
        return res;
    }
}
