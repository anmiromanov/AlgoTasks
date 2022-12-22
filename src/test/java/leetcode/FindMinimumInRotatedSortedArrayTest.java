package leetcode;

import leetcode.binarysearch.FindMinimumInRotatedSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {
    FindMinimumInRotatedSortedArray t = new FindMinimumInRotatedSortedArray();
    @Test
    void findMin1() {
        int[] nums = {3,4,5,1,2};
        int result = 1;
        assertTrue(t.findMin(nums) == result);
    }

    @Test
    void findMin2(){
        int[] nums = {4,5,6,7,0,1,2};
        int result = 0;
        assertTrue(t.findMin(nums) == result);
    }

    @Test
    void findMin3(){
        int[] nums = {11,13,15,17};
        int result = 11;
        assertTrue(t.findMin(nums) == result);
    }
}