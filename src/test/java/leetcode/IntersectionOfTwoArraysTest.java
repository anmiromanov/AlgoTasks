package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysTest {

    IntersectionOfTwoArrays t = new IntersectionOfTwoArrays();
    @Test
    void intersection1() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = {2};
        assertTrue(Arrays.equals(t.intersection(nums1, nums2), result));
    }

    @Test
    void intersection2() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = {4,9};
        assertTrue(Arrays.equals(t.intersection(nums1, nums2), result));
    }
}