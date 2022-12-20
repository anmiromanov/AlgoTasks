package leetcode;
/*
Задача из раздела с теорией:
https://leetcode.com/explore/learn/card/binary-search/144/more-practices/1033/
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums){
        if (nums.length ==1){
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;

        if (nums[right] > nums[left]){
            return nums[0];
        }

        while (right >= left){
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]){
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]){
                return nums[mid];
            }
            if (nums[mid] > nums[0]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
