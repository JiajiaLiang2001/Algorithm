/// Leetcode 1011. Capacity To Ship Packages Within D Days
/// https://leetcode.cn/problems/capacity-to-ship-packages-within-d-days/

import java.util.Arrays;

public class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = Arrays.stream(weights).max().getAsInt();
        int r = Arrays.stream(weights).sum();
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (costDays(weights, mid) <= days)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    private int costDays(int[] weights, int k) {
        int cur = 0, res = 0;
        for (int weight : weights)
            if (cur + weight <= k) cur += weight;
            else {
                res++;
                cur = weight;
            }
        res++;
        return res;
    }
}
