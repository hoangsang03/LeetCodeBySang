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
            // If sum is negative number, assign current element for sum
            // check if sum greater than max?
            // then skip. We only calculate value which is positive
            while (i < nums.length && sum <= 0) {
                sum = nums[i];
                if (max < sum) max = sum;
                // next element
                i++;
            }
            // At this point, sum is greater than 0 or i = length - 1
            // if value smaller than 0 -> sum will be decrease
            if (i == nums.length) {
                break;
            } else if (nums[i] < 0) {
                //we need stop calculate sum and find max at the moment
                if (max < sum) max = sum;
                // Calculating summaray then loop again to check if it is greater than 0
                sum += nums[i];
            } else {
                sum += nums[i];
            }

        }
        // finding maximum of max and final summary result
        if (max < sum) max = sum;
        return max;
    }

    public int maxSubArrayOfOtherOne(int[] nums)
    {
        int let_sum = -999999,curr_sum=0;
        for (int num : nums) {
            curr_sum += num;
            if (let_sum < curr_sum)
                let_sum = curr_sum;
            if (curr_sum < 0)
                curr_sum = 0;


        }
        return let_sum;

    }
}
