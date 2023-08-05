package TopInterview150Test;

import TopInterview150.Leetcode122;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode122Test {
    Leetcode122 obj = new Leetcode122();

    @Test
    public void Given_Array_Calculate_Profit(){
        int[] nums = {1,4,3,23,12,34};
        int expected = 3 + 20 + 22;
        int actual = obj.maxProfit(nums);
        assertEquals(expected,actual);
    }
}