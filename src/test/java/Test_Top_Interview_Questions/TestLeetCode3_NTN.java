package Test_Top_Interview_Questions;

import Top_Interview_Questions.LeetCode3_NTN;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class TestLeetCode3_NTN extends TestCase {
    LeetCode3_NTN obj = new LeetCode3_NTN();

    @Test
    public void testlengthOfLongestSubstring() {
        assertEquals(obj.lengthOfLongestSubstring("dvdf"), 2);
    }
}
