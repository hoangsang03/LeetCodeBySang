package Test_LeetCode_NTN;

import LeetCode_NTN.LeetCode80;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : hoang sang
 */
public class LeetCode80Test {
    LeetCode80 obj = new LeetCode80();

    /**
     * Test method removeDuplicates
     */
    @Test
    public void testremoveDuplicates() {
        int[] nums = {0,0,0,1,1,2,2,3,3,3,3};
        int actual = obj.removeDuplicates(nums);
        int expected = 8;
        assertEquals(expected,actual);
    }
    /**
     * Test method countNumberRemainingValue
     */
    @Test
    public void testcountNumberRemainingValue() {
        int[] nums; // => length * 4 => 40 ; 3 * 10^4 * 10^4 => 3*10^8

        nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(10, obj.countNumberRemainingValue(nums));
        System.out.println("nums.size : " + nums.length);
        System.out.println("number calling for " + obj.bigO);

    }

    @Test
    public void testCountNumberRemainingValue_Sang() {
        int[] nums = {0, 0, 0, 1, 1, 2, 2, 3, 3, 3}; // => length * distinct  => 40 ; 3 * 10^4 * 10^4 => 3*10^8
        // (length + distinct) - 1 => (3 * 10^4 + 10^4) - 1 => 4*10^4
        assertEquals(8, obj.countNumberRemainingValue_Sang(nums));
        System.out.println("nums.size : " + nums.length);
        System.out.println("number calling for " + obj.bigO);

    }

    /**
     * Test method countNumberValueThatOccursMoreThan2Times
     */
    @Test
    public void testcountNumberValueThatOccursMoreThan2Times() {
        int[] nums = {0, 0, 0, 1, 1, 2, 2, 3, 3, 3};
        assertEquals(2, obj.countNumberValueThatOccursMoreThan2Times(nums));
    }

    @Test
    public void testChangeStaticInt() {
        int[] nums = new int[]{1, 2, 3};
        doubleValueInArray(nums);
        int[] expected = {2, 4, 6};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(nums[i],expected[i]);
        }
    }

    private void doubleValueInArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= 2;
        }
    }

}