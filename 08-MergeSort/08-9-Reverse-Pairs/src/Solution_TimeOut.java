/// Leetcode 剑指 Offer 51. 数组中的逆序对
/// https://leetcode.cn/problems/shu-zu-zhong-de-ni-xu-dui-lcof/

public class Solution_TimeOut {
    public int reversePairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] > nums[j]) res++;
        return res;
    }
    // Time out!!!
}
