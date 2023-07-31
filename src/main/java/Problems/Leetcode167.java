package Problems;
/**
 * {@code @Author:} hoangsang03 <br>
 * Title: 167. Two Sum II - Input Array Is Sorted <br>
 * Level: <b>Medium</b> <br>
 * Link: <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">Leetcode167</a>
 */
public class Leetcode167 {

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
