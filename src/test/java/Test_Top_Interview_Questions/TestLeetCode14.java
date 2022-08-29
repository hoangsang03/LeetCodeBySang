package Test_Top_Interview_Questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Top_Interview_Questions.LeetCode14;
import org.junit.jupiter.api.Test;

public class TestLeetCode14 {
    LeetCode14 obj = new LeetCode14();

    @Test
    public void testLongestCommonPrefix_1() {
        String[] strs = {"flower", "flow", "flight"};
        String expected = "fl";
        assertEquals(expected,obj.longestCommonPrefix(strs));
    }

    @Test
    public void testLongestCommonPrefix_2() {
        String[] strs = {"flower", "flow", "flight"};
        String expected = "fl";
        assertEquals(expected,obj.longestCommonPrefix(strs));
    }
    @Test
    public void testLongestCommonPrefix_3() {
        String[] strs = {"flower", "flower", "flower"};
        String expected = "flower";
        assertEquals(expected,obj.longestCommonPrefix(strs));
    }
    @Test
    public void testLongestCommonPrefix_4() {
        String[] strs = {"flower", "fslow", "falight"};
        String expected = "";
        assertEquals(expected,obj.longestCommonPrefix(strs));
    }
    @Test
    public void testLongestCommonPrefix_5() {
        String[] strs = {"flower", "flow", ""};
        String expected = "";
        assertEquals(expected,obj.longestCommonPrefix(strs));
    }
    @Test
    public void testLongestCommonPrefix_6() {
        String[] strs = {"1flower", "1flow", "1flight"};
        String expected = "1fl";
        assertEquals(expected,obj.longestCommonPrefix(strs));
    }
    @Test
    public void testLongestCommonPrefix_7() {
        String[] strs = {"flower"};
        String expected = "flower";
        assertEquals(expected,obj.longestCommonPrefix(strs));
    }
}
