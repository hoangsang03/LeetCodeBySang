package Test_LeetCode_NTN;

import LeetCode_NTN.LeetCode167;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeetCode167Test {
    LeetCode167 obj = new LeetCode167();

    @Test
    public void testTwoSum(){
        int[] numbers = {-1,0};
        int target = -1;
        int[] actual = obj.twoSum(numbers,target);
        int[] expected = {1,2};
        assertArrayEquals(actual,expected);
    }
    @Test
    public void testTwoSumI(){
        int[] numbers = {-1,0,5,6,8};
        int target = 11;
        int[] actual = obj.twoSum1(numbers,target);
        int[] expected = {3,4};
        assertArrayEquals(actual,expected);
    }
}
