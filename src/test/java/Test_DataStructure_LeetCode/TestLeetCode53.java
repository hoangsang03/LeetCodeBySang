package Test_DataStructure_LeetCode;

import DataStructure_LeetCode.LeetCode53;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class TestLeetCode53 {
    LeetCode53 obj = new LeetCode53();

    @Test
    public void testMaxSubArray_1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        Assertions.assertEquals(expected, obj.maxSubArray(nums));
    }

    @Test
    public void testMaxSubArray_2() {
        int[] nums = {5, 4, -1, 7, 8};
        int expected = 23;
        Assertions.assertEquals(expected, obj.maxSubArray(nums));
    }

    @Test
    public void testMaxSubArray_3() {
        int[] nums = {4};
        int expected = 4;
        Assertions.assertEquals(expected, obj.maxSubArray(nums));
    }

    @Test
    public void testMaxSubArray_4() {
        int[] nums = {-2, 0, -3, -1, -5};
        int expected = 0;
        Assertions.assertEquals(expected, obj.maxSubArray(nums));
    }

    @Test
    public void testMaxSubArray_5() {
        int[] nums = {-2, -3, -1, -5, -2, -3, -1, -5};
        int expected = -1;
        Assertions.assertEquals(expected, obj.maxSubArray(nums));
    }

    @Test
    public void testMaxSubArray_6() {
        int[] nums = {-2, -3, -1, -5, -2, -3, -1, -5, 0};
        int expected = 0;
        Assertions.assertEquals(expected, obj.maxSubArray(nums));
    }

    @Test
    public void testMaxSubArray_() {
        int[] nums = {-2, 1,2,3,4};
        int expected = 10;
        Assertions.assertEquals(expected, obj.maxSubArray(nums));
    }

}
