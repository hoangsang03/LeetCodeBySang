package Test_Top_Interview_Questions;

import Top_Interview_Questions.LeetCode859;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestLeetCode859 {
    LeetCode859 obj = new LeetCode859();

    @Test
    public void testBuddyStrings_1() {
        String s ="abclasdf";
        String goal= "abclasdf";
        assertTrue(obj.buddyStrings(s,goal));
    }

    @Test
    public void testBuddyStrings_2() {
        String s ="aaaaaaa";
        String goal= "aaaaaaa";
        assertTrue(obj.buddyStrings(s,goal));
    }

    @Test
    public void testBuddyStrings_3() {
        String s ="abcdefgh";
        String goal= "abcdefgh";
        assertFalse(obj.buddyStrings(s,goal));
    }

    @Test
    public void testBuddyStrings_4() {
        String s ="bacedfgh";
        String goal= "abcdefgh";
        assertFalse(obj.buddyStrings(s,goal));
    }

    @Test
    public void testBuddyStrings_5() {
        String s ="abcdefghaa";
        String goal= "abcdefghbb";
        assertFalse(obj.buddyStrings(s,goal));
    }

}
