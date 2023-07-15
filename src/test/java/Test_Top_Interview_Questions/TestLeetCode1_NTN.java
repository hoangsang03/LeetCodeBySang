package Test_Top_Interview_Questions;

import Top_Interview_Questions.LeetCode1_NTN;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLeetCode1_NTN {
    LeetCode1_NTN obj = new LeetCode1_NTN();
    @Test
    public void testTwoSum(){
        int[] nums = {3,2,5,6};
        int[] result = {1,2};
        assertArrayEquals(result, obj.twoSum(nums,7));
    }

    @Test
    public void testTwoSumHM(){
        int[] nums = {3,2,5,6};
        int[] result = {1,2};
       assertArrayEquals(result,obj.twoSum(nums,7));
    }

}
