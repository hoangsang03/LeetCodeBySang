package Problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode167Test {
    Leetcode167 obj = new Leetcode167();

    @Test
    public void Given_Array_And_Target_Two_Sum(){
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] expected = {1,2};
        int[] actual = obj.twoSum(nums,target);

        assertArrayEquals(expected,actual);
    }

}