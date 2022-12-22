package leetcode.twopointrs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIITest {
    TwoSumII ts = new TwoSumII();

    @Test
    void twoSum1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] value = {1,2};
        int[] res = ts.twoSum(nums, target);
        System.out.println(res[0] + ", " + res[1]);
        assertTrue(Arrays.equals(res, value));
    }

    @Test
    void twoSum2() {
        int[] nums = {2,3,4};
        int target = 6;
        int[] value = {1,3};
        int[] res = ts.twoSum(nums, target);
        assertTrue(Arrays.equals(res, value));
    }

    @Test
    void twoSum3() {
        int[] nums = {-1,0};
        int target = -1;
        int[] value = {1,2};
        int[] res = ts.twoSum(nums, target);
        assertTrue(Arrays.equals(res, value));
    }
}