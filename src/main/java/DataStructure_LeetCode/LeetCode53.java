package DataStructure_LeetCode;

/**
 * Title: 53. Maximum Subarray
 * Difficulty: Medium
 * Link : <a href="https://leetcode.com/problems/maximum-subarray/">...</a>
 */
public class LeetCode53 {

    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number)
     * which has the largest sum and return its sum.
     * A subarray is a contiguous part of an array.
     * Constraints:
     * <p>
     * 1 <= nums.length <= 105
     * -104 <= nums[i] <= 104
     *
     * @param nums : an integer array
     * @return : largest sum of contigouus subarray
     * <p>
     * Idea:
     */

    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            while (i < nums.length - 1 && sum <= 0) {
                sum = nums[i];
                if (max < sum) max = sum;
                i++;
            }
            // if value smaller than 0 -> sum will be decrease,
            if (nums[i] < 0) {
                //we need stop calculate sum and find max at the moment
                if (max < sum) max = sum;
                sum += nums[i];
                continue;
            }
            sum += nums[i];
        }
        if (max < nums[nums.length - 1]) max = nums[nums.length - 1];
        if (max < sum) max = sum;
        return max;
    }
}
