package Test_LeetCode_NTN;

import LeetCode_NTN.LeetCode70;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode70Test {
    LeetCode70 obj = new LeetCode70();
    @Test
    public void testClimbStairs(){
        int actual = obj.climbStairs(6);
        int expected = 13;
        assertEquals(expected,actual);
        System.out.println(obj.big0);
    }
    @Test
    public void testClimbStairs1(){
        int actual = obj.climbStairs1(6);
        int expected = 13;
        assertEquals(expected,actual);

    }
}
