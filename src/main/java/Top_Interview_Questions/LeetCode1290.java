package Top_Interview_Questions;

/*
 * 1290. Convert Binary Number in a Linked List to Integer
 * Difficulty: Easy
 * Link : https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * Reference: https://www.geeksforgeeks.org/inner-class-java/
 */


public class LeetCode1290 {
    /*
     *Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

     *Return the decimal value of the number in the linked list.

     *The most significant bit is at the head of the linked list.
     *
     * Constraints:

     *The Linked List is not empty.
     *Number of nodes will not exceed 30.
     *Each node's value is either 0 or 1.
     */

    public int getDecimalValue(ListNode head) {
        int numberNode = 0;
        int[] nodeArr = new int[30];
        ListNode nextNode = head;
        do {
            nodeArr[numberNode] = nextNode.val;
            numberNode++;
            nextNode = nextNode.next;

        } while (nextNode != null);
        return binaryToDecimal(nodeArr, numberNode);
    }

    private int binaryToDecimal(int[] nodeArr, int numberNode) {
        int decimal = 0;
        int powerof2 = 1;
        for (int i = numberNode - 1; i > -1 ; i--){
            decimal += nodeArr[i]*powerof2;
            powerof2 *= 2;
        }
        return decimal;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
