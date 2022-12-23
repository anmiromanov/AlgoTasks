package leetcode.binarysearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
350. Intersection of Two Arrays II
https://leetcode.com/problems/intersection-of-two-arrays-ii/
* */
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums1){
            if (map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (Integer i : nums2){
            if (map.containsKey(i)){
                if (map.get(i) > 1){
                    map.put(i, map.get(i) - 1);
                } else {
                    map.remove(i);
                }
                list.add(i);
            }
        }

        int[] result = new int[list.size()];
        int i = 0;
        while (i < list.size()){
            result[i] = list.get(i);
            i++;
        }
        return result;
    }
}
