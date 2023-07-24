package Test_LeetCode_NTN;
import LeetCode_NTN.LeetCode3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode3Test {
    LeetCode3 obj = new LeetCode3();

    @Test
    public void testlengthOfLongestSubstring() {
        int actual = obj.lengthOfLongestSubstring("abcabcbb"); // 2
        int expected = 3;
        assertEquals(expected,actual );
        System.out.println(obj.Big0);
    }
    @Test
    public void testlengthOfLongestSubstring0() {
        String s = "c";
        int actual = obj.lengthOfLongestSubstring(s); // 2
        int expected = 1;
        assertEquals(expected,actual );
        System.out.println(obj.Big0);
        System.out.println(s.length());
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
    @Test
    public void testlengthOfLongestSubstring3() {
        int actual = obj.lengthOfLongestSubstring("dvdf"); // 2
        int expected = 3;
        assertEquals(expected,actual);
    }
    @Test
    public void testlengthOfLongestSubstring4() {
        String s = "#@$#s#da";
        int actual = obj.lengthOfLongestSubstring(s); // 2
        int expected = 4;
        assertEquals(expected,actual );
        System.out.println(obj.Big0);
        System.out.println(s.length());
    }
}
