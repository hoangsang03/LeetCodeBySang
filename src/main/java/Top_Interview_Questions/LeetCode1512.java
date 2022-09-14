package Top_Interview_Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * Title: 1512. Number of Good Pairs
 * Dificulty: Easy
 * Link: https://leetcode.com/problems/number-of-good-pairs/
 */
public class LeetCode1512 {
    /*
     *Given an array of integers nums, return the number of good pairs.
     *             A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     *
     * Constraints:

        1 <= nums.length <= 100
        1 <= nums[i] <= 100
     *
     *
     */

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> valueAndNumberOfExistence = new HashMap<>();
        int numberOfExistence;
        int count = 0;
        for (int num : nums) {
            // if the value is existent more than one in nums array -> There are more good pairs
            if (valueAndNumberOfExistence.containsKey(num)) {
                numberOfExistence = valueAndNumberOfExistence.get(num) + 1;
                valueAndNumberOfExistence.replace(num, numberOfExistence);
                // add additional good pairs
                count += numberOfExistence - 1;
            } else {
                valueAndNumberOfExistence.put(num, 1);
            }
        }
        return count;
    }

    /* Idea: Use Array to record number existence of value
    *   index: value of nums[i]
    *   value of counts[index]: number existence
    *  This idea only suitables because value in this problem is always smaller than or equal 100
     *
     */
    public int numIdenticalPairsOfOtherOne(int[] nums) {
        int count = 0;
        int[] counts = new int[101];

        for (int i : nums) {
            // counts[i] ++ : increase number existence of value
            // there are more good pairs if counts[i] > 0 before reach below statement
            count = count + counts[i]++;
        }

        return count;
    }
}
