package Problems;
/**
 * {@code @Author:} hoangsang03 <br>
 * Title: 167. Two Sum II - Input Array Is Sorted <br>
 * Level: <b>Medium</b> <br>
 * Link: <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">Leetcode167</a>
 */
public class Leetcode167 {
    /**
     * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.
     * <br>
     * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
     * <br>
     * The tests are generated such that there is exactly one solution. You may not use the same element twice.
     * <br>
     * Your solution must use only constant extra space.
     * @param numbers : given array
     * @param target : value for finding
     * @return a 2-element array indices
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return null;
    }
}
