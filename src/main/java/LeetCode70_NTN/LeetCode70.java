package LeetCode70_NTN;

/**
 * Title: Climbing stairs
 * <br> Level: Easy
 * <br> Link: <a href = "https://leetcode.com/problems/climbing-stairs/">LeetCode 70</a>
 */
public class LeetCode70 {
    public int big0;
    /**
     * You are climbing a staircase. It takes n steps to reach the top.
     * <br>Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     *
     * <br>Example 1:
     * <br>Input: n = 2
     * <br>Output: 2
     * <br>Explanation: There are two ways to climb to the top.
     * <br>1. 1 step + 1 step
     * <br>2. 2 steps
     * <br>Example 2:
     * <br>Input: n = 3
     * <br>Output: 3
     * <br>Explanation: There are three ways to climb to the top.
     * <br>1. 1 step + 1 step + 1 step
     * <br>2. 1 step + 2 steps
     * <br>3. 2 steps + 1 step
     * <br>Constraints:
     * <br>1 <= n <= 45
     * @author : NTN
     */
    public int climbStairs(int n) {
        int count = 3;
        int n1  = 1;
        int n2 = 2;
        if(n == 1) {
            return n1;
        }else if(n == 2) {
            return n2;
        }else if (n >= 3) {
            while(count <= n) {
                big0++;
                int temp = n2;
                n2 += n1;
                n1 = temp;
                count++;
            }
        }

        return n2;
    }
}