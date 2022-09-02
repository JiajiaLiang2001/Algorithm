/// Leetcode 350. Intersection of Two Arrays II
/// https://leetcode.cn/problems/intersection-of-two-arrays-ii/

import java.util.ArrayList;
import java.util.TreeMap;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        // nums1 = [1,2,2,1] -> map = [(1,2),(2,2)]
        for (int i : nums1) {
            if (!map.containsKey(i))
                map.put(i, 1);
            else
                map.put(i, map.get(i) + 1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i : nums2) { // nums2 = [2,2]
            if (map.containsKey(i)) {
                res.add(i);
                map.put(i, map.get(i) - 1);
                if (map.get(i) == 0)
                    map.remove(i);
            }
        }
        int[] ret = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            ret[i] = res.get(i);
        return ret;
    }
}
