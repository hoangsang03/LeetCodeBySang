package Top_Interview_Questions;

/*
 * Difficulty: Medium
 * 7. Reverse Integer
 * Link : https://leetcode.com/problems/reverse-integer/
 */
public class LeetCode7 {

    /*
     * Given a signed 32-bit integer x, return x with its digits reversed. If
     * reversing x causes the value to go outside the signed 32-bit integer range
     * [-2^31, 2^31 - 1], then return 0.
     *
     * Assume the environment does not allow you to store 64-bit integers (signed or
     * unsigned).
     */

    public int reverse(int x) {
        long reverseValue = 0;
        while (x != 0) {
            reverseValue = reverseValue * 10 + (x % 10);
            x /= 10;
        }
        if (Integer.MIN_VALUE <= reverseValue && reverseValue <= Integer.MAX_VALUE) {
            return (int) reverseValue;
        }
        return 0;
    }
}
