package Test_Top_Interview_Questions;

import Top_Interview_Questions.LeetCode1_Nghia;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLeetCode1_Nghia {
    LeetCode1_Nghia obj = new LeetCode1_Nghia();
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
