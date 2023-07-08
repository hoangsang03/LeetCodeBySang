package TopInterview150Test;

import TopInterview150.LC80_RemoveDuplicatesFromSortedArrayII;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : hoang sang
 */
public class LC80_RemoveDuplicatesFromSortedArrayIITest {
    LC80_RemoveDuplicatesFromSortedArrayII obj = new LC80_RemoveDuplicatesFromSortedArrayII();

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

        int[] nums = {1,1,2,2,3,3,3};
        int[] output = {1,1,2,2,3,3};
    }
    @Test
    public void testTemoveDuplicates_3() {

        int[] nums = {0,1,1,2,2,3,3,3,3,4};
//        =>  nums = {0,1,1,2,2,3,3,4,-9999999,-9999999};
//        return k : k = 7
        int[] output = {0,1,1,2,2,3,3,4};
        ///////////////
        // nums = {a0,a1,a2 ... an}
    }
    /**
     * Test method countNumberRemainingValue
     */
    @Test
    public void testcountNumberRemainingValue(){
        int[] nums = {0,0,0,1,1,2,2,3,3,3};
        assertEquals(8,obj.countNumberRemainingValue(nums));
    }

    /**
     * Test method countNumberValueThatOccursMoreThan2Times
     */
    @Test
    public void testcountNumberValueThatOccursMoreThan2Times(){
        int[] nums = {0,0,0,1,1,2,2,3,3,3};
        assertEquals(2,obj.countNumberValueThatOccursMoreThan2Times(nums));
    }

}
