package Test_Top_Interview_Questions;

import Top_Interview_Questions.LeetCode121_Nghia;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class TestLeetCode121_Nghia extends TestCase {
    LeetCode121_Nghia obj = new LeetCode121_Nghia();
    @Test
    public void testMaxProfit() {
        int[] profit = {7,6,2,5,3,6};
        assertEquals(obj.maxProfit(profit), 4);
        System.out.println(obj.big0);
    }
}
