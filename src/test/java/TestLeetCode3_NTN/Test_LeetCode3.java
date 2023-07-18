package TestLeetCode3_NTN;
import LeetCode3_NTN.LeetCode3;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class Test_LeetCode3 extends TestCase {
    LeetCode3 obj = new LeetCode3();

    @Test
    public void testlengthOfLongestSubstring() {
        int actual = obj.lengthOfLongestSubstring("abcabcbb"); // 2
        int expected = 3;
        assertEquals(expected,actual );
    }
    @Test
    public void testlengthOfLongestSubstring1() {
        int actual = obj.lengthOfLongestSubstring(""); // 2
        int expected = 0;
        assertEquals(expected,actual );
    }
    @Test
    public void testlengthOfLongestSubstring2() {
        int actual = obj.lengthOfLongestSubstring(" "); // 2
        int expected = 1;
        assertEquals(expected,actual );
    }
}
