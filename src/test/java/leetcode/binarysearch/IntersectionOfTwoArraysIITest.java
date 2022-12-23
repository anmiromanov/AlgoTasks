package leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysIITest {
    IntersectionOfTwoArraysII iota = new IntersectionOfTwoArraysII();

    @Test
    void intersect1() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] answer = {2,2};
        int[] result = iota.intersect(nums1, nums2);
        assertTrue(Arrays.equals(result, answer));
     }

    @Test
    void intersect2() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] answer = {9, 4};
        int[] result = iota.intersect(nums1, nums2);
        assertTrue(Arrays.equals(result, answer));
    }
}