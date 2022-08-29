package Test_Top_Interview_Questions;

import Top_Interview_Questions.LeetCode13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLeetCode13 {
    LeetCode13 obj = new LeetCode13();

    @Test
    public void testRomanToInt() {
        String roman = "III";
        int expected = 3;
        assertEquals(expected, obj.romanToInt(roman));
    }

    @Test
    public void testRomanToInt_2() {
        String roman = "IV";
        int expected = 4;
        assertEquals(expected, obj.romanToInt(roman));
    }

    @Test
    public void testRomanToInt_3() {
        String roman = "VI";
        int expected = 6;
        assertEquals(expected, obj.romanToInt(roman));
    }

    @Test
    public void testRomanToInt_4() {
        String roman = "VII";
        int expected = 7;
        assertEquals(expected, obj.romanToInt(roman));
    }

    @Test
    public void testRomanToInt_5() {
        String roman = "VIII";
        int expected = 8;
        assertEquals(expected, obj.romanToInt(roman));
    }

    @Test
    public void testRomanToInt_6() {
        String roman = "XI";
        int expected = 11;
        assertEquals(expected, obj.romanToInt(roman));
    }

    @Test
    public void testRomanToInt_7() {
        String roman = "X";
        int expected = 10;
        assertEquals(expected, obj.romanToInt(roman));
    }

    @Test
    public void testRomanToInt_8() {
        String roman = "CIII";
        int expected = 103;
        assertEquals(expected, obj.romanToInt(roman));
    }

    @Test
    public void testRomanToInt_9() {
        String roman = "XC";
        int expected = 90;
        assertEquals(expected, obj.romanToInt(roman));
    }

    @Test
    public void testRomanToInt_10() {
        String roman = "CDIII";
        int expected = 403;
        assertEquals(expected, obj.romanToInt(roman));
    }

    @Test
    public void testRomanToInt_11() {
        String roman = "MMMDCCCLXXXVIII";
        int expected = 3888;
        assertEquals(expected, obj.romanToInt(roman));
    }

}
