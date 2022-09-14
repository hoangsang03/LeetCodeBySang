package Test_Top_Interview_Questions;

import Top_Interview_Questions.LeetCode771;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLeetCode771 {
    LeetCode771 obj = new LeetCode771();

    @Test
    public void testNumJewelsInStones_1() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        assertEquals(expected,obj.numJewelsInStones(jewels,stones));
    }

    @Test
    public void testNumJewelsInStones_2() {
        String jewels = "B";
        String stones = "aAAbbbb";
        int expected = 0;
        assertEquals(expected,obj.numJewelsInStones(jewels,stones));
    }
    @Test
    public void testNumJewelsInStones_() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        assertEquals(expected,obj.numJewelsInStones(jewels,stones));
    }

}
