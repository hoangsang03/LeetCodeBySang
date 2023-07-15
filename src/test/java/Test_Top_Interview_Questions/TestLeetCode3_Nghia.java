package Test_Top_Interview_Questions;

import Top_Interview_Questions.LeetCode3_Nghia;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class TestLeetCode3_Nghia extends TestCase {
    LeetCode3_Nghia obj = new LeetCode3_Nghia();

    @Test
    public void testlengthOfLongestSubstring() {
        assertEquals(obj.lengthOfLongestSubstring("dvdf"), 2);
    }
}
