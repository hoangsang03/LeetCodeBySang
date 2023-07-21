package TestLeetCode70_NTN;

import LeetCode70_NTN.LeetCode70;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLeetCode70 {
    LeetCode70 obj = new LeetCode70();
    @Test
    public void testClimbStairs(){
        int actual = obj.climbStairs(6);
        int expected = 13;
        assertEquals(expected,actual);
        System.out.println(obj.big0);
    }
    @Test
    public void testClimbStairsDQ(){
        int actual = obj.climbStairsDQ(6);
        int expected = 13;
        assertEquals(expected,actual);

    }
}
