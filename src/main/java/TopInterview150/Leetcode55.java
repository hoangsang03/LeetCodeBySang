package TopInterview150;

/**
 * {@code @Author:} hoangsang03 <br>
 * Title: 55. Jump Game <br>
 * Level: <b>Medium</b> <br>
 * Link: <a href="https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150">LeetCode55</a>
 */
public class Leetcode55 {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int destinationPoint = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= destinationPoint) {
                destinationPoint = i;
            }
        }
        return destinationPoint == 0;
    }
}
