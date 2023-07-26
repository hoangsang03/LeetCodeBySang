package LeetCode_NTN;

import java.util.HashMap;

/**
 * Title: Two Sum
 * <br> Level: Easy
 * <br> Link: <a href = "https://leetcode.com/problems/two-sum/">LeetCode 1</a>
 */
public class LeetCode1 {
    /**
     * Given an array of integers nums and an integer target, return indices of the
     * two numbers such that they add up to target.
     *
     * <br>You may assume that each input would have exactly one solution, and you may
     * not use the same element twice.
     *
     * <br>You can return the answer in any order.
     *
     * <br>Example 1:
     *
     * <br>Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
     * nums[0] + nums[1] == 9, we return [0, 1]. Example 2:
     *
     * <br>Input: nums = [3,2,4], target = 6 Output: [1,2] Example 3:
     *
     * <br>Input: nums = [3,3], target = 6 Output: [0,1]
     *
     *
     * <br>Constraints:
     *
     * <br>2 <= nums.length <= 104
     * <br>-109 <= nums[i] <= 109
     * <br>-109 <= target <= 109 Only one
     * <br>valid answer exists.
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> container = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(container.containsKey(target - nums[i])) {
                return new int[] {container.get(target - nums[i]),i};
            }else {
                container.put(nums[i], i);
            }
        }
        return null;
    }
    //Y tuong khac
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j) {
                    if(nums[i] + nums[j] == target) {
                        return new int[] {i,j};
                    }
                }
            }
        }

        return null;
    }

}
