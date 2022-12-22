package leetcode.twopointrs;
/*
167. Two Sum II - Input Array Is Sorted
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
* */
public class TwoSumII {
    public int[] twoSum(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[2];

        while (left < right){
            int currentSum = nums[left] + nums[right];
            if (currentSum == target){
                res[0] = left + 1;
                res[1] = right + 1;
                break;
            } else if (currentSum > target){
                right--;
            } else {
                left++;
            }
        }
        return res;
    }
}
