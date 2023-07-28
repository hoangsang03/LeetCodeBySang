package TopInterview150Test;

import TopInterview150.Leetcode26;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode26Test {
    Leetcode26 obj = new Leetcode26();

    @Test
    public void Given_An_Distinct_Value_Array_TestRemoveDuplicate(){
        int[] nums = {1,2,3,5,7,8,9,11};
        int[] expectedArr = {1,2,3,5,7,8,9,11};
        int k = obj.removeDuplicates(nums);
        int expected = expectedArr.length;

        assertEquals(expected,k);
        assertArrayEquals(expectedArr,nums);
    }
    @Test
    public void Given_An_OnlyOne_Value_Array_TestRemoveDuplicate(){
        int[] nums = {3,3,3,3,3,3,3,3,3,3,3};
        int[] expectedArr = {3,3,3,3,3,3,3,3,3,3,3};
        int k = obj.removeDuplicates(nums);
        int expected = 1;

        assertEquals(expected,k);
        assertArrayEquals(expectedArr,nums);
    }
    @Test
    public void Given_An_OnlyOne_Element_Array_TestRemoveDuplicate(){
        int[] nums = {3};
        int[] expectedArr = {3};
        int k = obj.removeDuplicates(nums);
        int expected = 1;

        assertEquals(expected,k);
        assertArrayEquals(expectedArr,nums);
    }
}