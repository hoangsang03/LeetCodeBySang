package Test_Top_Interview_Questions;

import Top_Interview_Questions.LeetCode121_NTN;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class TestLeetCode121_NTN extends TestCase {
    LeetCode121_NTN obj = new LeetCode121_NTN();
    @Test
    public void testMaxProfit() {
        int[] profit = {7,6,2,5,3,6};
        assertEquals(obj.maxProfit(profit), 4);
        System.out.println(obj.big0);
    }
    @Test
    public void testMaxProfit1() {
        int[] profit = {7,6,5,4,3,2};
        assertEquals(obj.maxProfit(profit), 0);
        System.out.println(obj.big0);
    }
}
