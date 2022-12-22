package leetcode.binarysearch;
/*
Задача из раздела с теорией:
https://leetcode.com/explore/learn/card/binary-search/144/more-practices/1034/
**/

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        for (Integer i : nums1){
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<>();
        for (Integer i: nums2){
            set2.add(i);
        }

        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int index = 0;
        for (Integer i : set1){
            result[index] = i;
            index++;
        }
        return result;
    }
}
