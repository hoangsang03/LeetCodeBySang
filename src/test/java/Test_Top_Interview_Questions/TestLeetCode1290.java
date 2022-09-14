package Test_Top_Interview_Questions;

import Top_Interview_Questions.LeetCode1290;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLeetCode1290 {
    LeetCode1290 obj = new LeetCode1290();

    @Test
    public void testGetDecimalValue() {
        LeetCode1290.ListNode node_5 = new LeetCode1290.ListNode(0, null);
        LeetCode1290.ListNode node_4 = new LeetCode1290.ListNode(1, node_5);
        LeetCode1290.ListNode node_3 = new LeetCode1290.ListNode(0, node_4);
        LeetCode1290.ListNode node_2 = new LeetCode1290.ListNode(1, node_3);
        LeetCode1290.ListNode node_1 = new LeetCode1290.ListNode(0, node_2);
        LeetCode1290.ListNode node_0 = new LeetCode1290.ListNode(0, node_1);

        int expected = 10;
        assertEquals(expected, obj.getDecimalValue(node_0));


    }
}
