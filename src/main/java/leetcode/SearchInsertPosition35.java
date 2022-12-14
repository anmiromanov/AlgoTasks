package leetcode;
/*
  35. Search Insert Position
  https://leetcode.com/problems/search-insert-position/?envType=study-plan&id=binary-search-i
*/
public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        int middle;

        while (min <= max) {
            middle = (min + max) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                min = middle + 1;
            } else {
                max = middle - 1;
            }
        }
        return min;
    }
}
