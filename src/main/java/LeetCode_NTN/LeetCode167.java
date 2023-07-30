package LeetCode_NTN;

/**
 * Title: Two Sum II
 * <br>Level: Medium
 * <br>Link: <a href = "https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?envType=study-plan-v2&envId=top-interview-150">LeetCode167</a>
 */
public class LeetCode167 {
    /**
     * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.
     *<br> Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
     * <br>The tests are generated such that there is exactly one solution. You may not use the same element twice.
     * <br>Your solution must use only constant extra space.
     * <br>Example 1:
     *
     * <br>Input: numbers = [2,7,11,15], target = 9
     * <br>Output: [1,2]
     * <br>Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
     * <br>Example 2:
     * <br>Input: numbers = [2,3,4], target = 6
     * <br>Output: [1,3]
     * <br>Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
     * <br>Example 3:
     * <br>Input: numbers = [-1,0], target = -1
     * <br>Output: [1,2]
     * <br>Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
     * <br>Constraints:
     * <br>2 <= numbers.length <= 3 * 104
     * <br>-1000 <= numbers[i] <= 1000
     * <br>numbers is sorted in non-decreasing order.
     * <br>-1000 <= target <= 1000
     * <br>The tests are generated such that there is exactly one solution.
     */
    public int[] twoSum(int[] numbers, int target) {
        int index1 = -1;
        int index2 = -1;
        int[] result = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length ; j++) {
                if(numbers[i] + numbers[j] == target) {
                    index1 = i + 1;
                    index2 = j + 1;
                    result[0] = index1;
                    result[1] = index2;
                    return result;
                }
            }
        }
        return null;
     }
}
