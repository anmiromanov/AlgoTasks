package leetcode;
/*
        704. Binary Search
        https://leetcode.com/problems/binary-search/?envType=study-plan&id=binary-search-i
*/
public class BinarySearch704 {
    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        int middle;

        while (min <= max){
            middle = (min + max) / 2;
            if (nums[middle] < target){
                min = middle + 1;
            } else if (nums[middle] > target)
                max = middle - 1;
            else {
                return middle;
            }
        }
        return -1;
    }
}
