package TopInterview150Test;

import TopInterview150.LeetCode80;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode80Test {
    LeetCode80 obj = new LeetCode80();

    @Test
    public void testRemoveDuplicates() {
        int[] nums ={1,1,1};
        int actual = obj.removeDuplicates(nums);
        int expected = 2;
        assertEquals(expected,actual);
    }
}
