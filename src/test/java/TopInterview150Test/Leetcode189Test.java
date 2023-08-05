package TopInterview150Test;

import TopInterview150.Leetcode189;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode189Test {
    Leetcode189 obj = new Leetcode189();

    /**
     * Constraints:
     *
     * <br>1 <= nums.length <= 10^5
     * <br>-23^1 <= nums[i] <= 23^1 - 1
     * <br>0 <= k <= 10^5
     */
    @Test
    public void Rotate_Array_With_K_Step(){
        int[] nums = {1,4,2,5,6,1,4,8,7};
        int[] expected = {7,1,4,2,5,6,1,4,8};
        int k = 1;
        obj.rotate(nums,k);

        System.out.println(k%nums.length);
        assertArrayEquals(expected,nums);

        nums = new int[]{1, 4, 2, 5, 6, 1, 4, 8, 7};
        k = 100;
        obj.rotate(nums,k);
        System.out.println(k%nums.length);
        assertArrayEquals(expected,nums);
    }

    @Test
    public void Rotate_One_Element_Array_With_K_Step(){
        int[] nums = {1};
        int[] expected = {1};
        int k = 10;
        obj.rotate(nums,k);

        System.out.println(k%nums.length);
        assertArrayEquals(expected,nums);

        nums = new int[]{1};
        k = 100;
        obj.rotate(nums,k);
        System.out.println(k%nums.length);
        assertArrayEquals(expected,nums);
    }
    @Test
    public void Rotate_4Elements_Array_With_K_Step(){
        int[] nums = {-1,-100,3,99};
        int[] expected = {3,99,-1,-100};
        int k = 2;
        obj.rotate(nums,k);

        System.out.println(k%nums.length);
        assertArrayEquals(expected,nums);
    }
    @Test
    public void Rotate_6Elements_Array_With_K_Step(){
        int[] nums = {1,2,3,4,5,6};
        int[] expected = {5,6,1,2,3,4};
        int k = 2;
        obj.rotate(nums,k);

        System.out.println(k%nums.length);
        assertArrayEquals(expected,nums);

        nums = new int[]{1,2,3,4,5,6};
        expected = new int[]{3,4,5,6,1,2};
        k = 4;
        obj.rotate(nums,k);
        assertArrayEquals(expected,nums);
    }

    @Test
    public void Given_TwoNumbers_FindGreatestCommonDivisor(){
        int num1 = 10;
        int num2 = 45;
        int actual = obj.findGreatestCommonDivisor(num1,num2);
        int expected = 5;
        assertEquals(expected,actual);
    }
    @Test
    public void Given_TwoBigNumbers_FindGreatestCommonDivisor(){
        int num1 = 100000;
        int num2 = 5449;
        int actual = obj.findGreatestCommonDivisor(num1,num2);
        int expected = 1;
        assertEquals(expected,actual);
    }
}