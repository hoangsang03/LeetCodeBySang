package Test_LeetCode_NTN;
import LeetCode_NTN.LeetCode80;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCodeTest80 {
        LeetCode80 obj = new LeetCode80();
    @Test
    public void testRemoveDuplicates(){
        int[] num = {0,0,0,1,1,2,2,3,3,3};
        int actual = obj.removeDuplicates(num);
        int expected = 8;
        assertEquals(expected,actual);
    }
}
