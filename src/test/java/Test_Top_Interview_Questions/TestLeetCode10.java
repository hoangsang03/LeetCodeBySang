package Test_Top_Interview_Questions;

import Top_Interview_Questions.LeetCode10;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *Constraints:
    1 <= s.length <= 20
    1 <= p.length <= 30
    s contains only lowercase English letters.
    p contains only lowercase English letters, '.', and '*'.
    It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
 */
public class TestLeetCode10 {
    LeetCode10 obj = new LeetCode10();

    @Test
    public void testIsMatch_1() {
        String s = "aa";
        String p = "a";

        assertFalse(obj.isMatch(s, p));
    }

    @Test
    public void testIsMatch_2() {
        String s = "aa";
        String p = "a*";

        assertTrue(obj.isMatch(s, p));
    }

    @Test
    public void testIsMatch_3() {
        String s = "ab";
        String p = ".*";

        assertTrue(obj.isMatch(s, p));
    }

    @Test
    public void testIsMatch_4() {
        String s = "ab";
        String p = "a.";

        assertTrue(obj.isMatch(s, p));
    }

    @Test
    public void testIsMatch_5() {
        String s = "ab";
        String p = ".b";

        assertTrue(obj.isMatch(s, p));
    }

    @Test
    public void testIsMatch_6() {
        String s = "abcaad";
        String p = "abca*d";

        assertTrue(obj.isMatch(s, p));
    }

    @Test
    public void testIsMatch_7() {
        String s = "abcdxyz";
        String p = "abc.xyz";

        assertTrue(obj.isMatch(s, p));
    }

    @Test
    public void testIsMatch_8() {
        String s = "abcdxyz";
        String p = "a.*z";

        assertTrue(obj.isMatch(s, p));
    }

    @Test
    public void testIsMatch_9() {
        String s = "abcdxyz";
        String p = "a.********z";

        assertTrue(obj.isMatch(s, p));
    }

    @Test
    public void testIsMatch_10() {
        String s = "aab";
        String p = "c*a*b";

        assertTrue(obj.isMatch(s, p));
    }
    @Test
    public void testIsMatch_11() {
        String s = "aab";
        String p = "a*b**";

        assertTrue(obj.isMatch(s, p));
    }

    @Test
    public void testIsMatch_12() {
        String s = "aaa";
        String p = "a*a";

        assertTrue(obj.isMatch(s, p));
    }
    @Test
    public void testIsMatch_13() {
        String s = "aaa";
        String p = "a*aa*a*aa";

        assertTrue(obj.isMatch(s, p));
    }

    @Test
    public void testIsMatch_14() {
        String s = "ab";
        String p = "a*b";

        assertTrue(obj.isMatch(s, p));
    }
    /*
    * Test processPattern method
    * "a*aa*a*aa" -> "aaaa*****"
     */
    @Test
    public void testProcessPattern_1() {
        String pattern = "a*aa*a*aa";
        assertEquals("aaaa*****",new String(obj.processPattern(pattern)));
    }
    @Test
    public void testProcessPattern_2() {
        String pattern = "bba*aa*a*aa";
        assertEquals("bbaaaa*****",new String(obj.processPattern(pattern)));
    }
    @Test
    public void testProcessPattern_3() {
        String pattern = "a*aa*a*acca";
        assertEquals("aaa*****cca",new String(obj.processPattern(pattern)));
    }
}
