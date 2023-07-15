package TopInterview150Test;

import TopInterview150.LC80_RemoveDuplicatesFromSortedArrayII_NTN;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : hoang sang
 */
public class LC80_RemoveDuplicatesFromSortedArrayIITest {
    LC80_RemoveDuplicatesFromSortedArrayII_NTN obj = new LC80_RemoveDuplicatesFromSortedArrayII_NTN();

    /**
     * 1 <= nums.length <= 3 * 10^4 <br>
     * -10^4 <= nums[i] <= 10^4
     */
    @Test
    public void testTemoveDuplicates_1() {

        int[] nums = {-10000, -10000, 1, 1, 1, 10000, 10000};
        int[] output = {-10000, -10000, 1, 1, 1, 10000, 10000};
    }

    @Test
    public void testTemoveDuplicates_2() {

        int[] nums = {1, 1, 2, 2, 3, 3, 3};
        int[] output = {1, 1, 2, 2, 3, 3};
    }

    @Test
    public void testTemoveDuplicates_3() {

        int[] nums = {0, 1, 1, 2, 2, 3, 3, 3, 3, 4};
//        =>  nums = {0,1,1,2,2,3,3,4,-9999999,-9999999};
//        return k : k = 7
        int[] output = {0, 1, 1, 2, 2, 3, 3, 4};
        ///////////////
        // nums = {a0,a1,a2 ... an}
    }

    /**
     * Test method removeDuplicates
     */
    @Test
    public void testremoveDuplicates() {
        int[] nums = {0,0,0,1,1,2,2,3,3,3};
        assertEquals(obj.removeDuplicates(nums),8);
    }
    /**
     * Test method countNumberRemainingValue
     */
    @Test
    public void testcountNumberRemainingValue() {
        int[] nums = {0, 0, 0, 1, 1, 2, 2, 3, 3, 3}; // => length * 4 => 40 ; 3 * 10^4 * 10^4 => 3*10^8
//        assertEquals(8,obj.countNumberRemainingValue(nums));
//        System.out.println("nums.size : " + nums.length);
//        System.out.println("number calling for " + obj.bigO);

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

//        nums = new int[]{0,1,2,3,4,5,6,7,8,9};
//        assertEquals(10,obj.countNumberRemainingValue(nums));
//        System.out.println("nums.size : " + nums.length);
//        System.out.println("number calling for " + obj.bigO);

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
