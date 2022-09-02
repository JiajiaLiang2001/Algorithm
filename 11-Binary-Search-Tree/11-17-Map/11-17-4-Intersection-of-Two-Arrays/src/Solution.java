/// Leetcode 349. Intersection of Two Arrays
/// https://leetcode.cn/problems/intersection-of-two-arrays/

import java.util.ArrayList;
import java.util.TreeSet;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> set = new TreeSet<>();
        // nums1 = [1,2,2,1] -> set = [1,2]
        for (int i : nums1)
            set.add(i);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (set.contains(i)) {
                list.add(i);
                set.remove(i);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }
}
