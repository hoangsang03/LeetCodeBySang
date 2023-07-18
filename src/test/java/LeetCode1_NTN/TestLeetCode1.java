package LeetCode1_NTN;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestLeetCode1 {
    LeetCode1 obj = new LeetCode1();

    @Test
    public void testTwoSum_1() {
        int[] nums = {2,7,11,15};
        int target = 17;
        int[] expected = {0,3};
        assertArrayEquals(expected,obj.twoSum(nums,target));
    }
    @Test
    public void testTwoSum_2() {
        int[] nums = {-3,2,7,11,15};
        int target = 8;
        int[] expected = {0,3};
        assertArrayEquals(expected,obj.twoSum(nums,target));
    }
    @Test
    public void testTwoSum_3() {
        int[] nums = {2,7,11,7,15};
        int target = 14;
        int[] expected = {1,3};
        assertArrayEquals(expected,obj.twoSum(nums,target));
    }
    @Test
    public void testTwoSum_4() {
        int[] nums = {-99,2,7,11,15,99};
        int target = 0;
        int[] expected = {0,5};
        assertArrayEquals(expected,obj.twoSum(nums,target));
    }
    @Test
    public void testTwoSum_5() {
        int[] nums = {2,7,3,5,11,15};
        int target = 16;
        int[] expected = {3,4};
        assertArrayEquals(expected,obj.twoSum(nums,target));
    }

}