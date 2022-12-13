package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearch704Test {

    BinarySearch704 binarySearch = new BinarySearch704();
    int[] arr = {-1,0,3,5,9,12};
    @Test
    void binarySearchTest1() {
        int target = 9;
        int index = 4;
        int result = binarySearch.search(arr, target);
        assertTrue(result == index);
    }

    @Test
    void array_does_not_contain_a_value(){
        int[] arr = {-1,0,3,5,9,12};
        int target = 2;
        int index = -1;
        int result = binarySearch.search(arr, target);
        assertTrue(result == index);
    }
}