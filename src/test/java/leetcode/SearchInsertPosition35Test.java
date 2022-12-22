package leetcode;

import leetcode.binarysearch.SearchInsertPosition35;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPosition35Test {
    SearchInsertPosition35 searchInsertPosition = new SearchInsertPosition35();

    @Test
    void searchInsertPosition1() {
        int[] arr = {1,3,5,6};
        int target = 5;
        int index = 2;
        int result = searchInsertPosition.searchInsert(arr, target);
        assertTrue(result == index);
    }

    @Test
    void searchInsertPosition2() {
        int[] arr = {1,3,5,6};
        int target = 2;
        int index = 1;
        int result = searchInsertPosition.searchInsert(arr, target);
        assertTrue(result == index);
    }

    @Test
    void searchInsertPosition3() {
        int[] arr = {1,3,5,6};
        int target = 7;
        int index = 4;
        int result = searchInsertPosition.searchInsert(arr, target);
        assertTrue(result == index);
    }
}