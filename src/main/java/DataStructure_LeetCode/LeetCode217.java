package DataStructure_LeetCode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Title:
 * Difficulty:
 * Link:
 */
public class LeetCode217 {
    /**
     * Given an integer array nums,
     * return true if any value appears at least twice in the array,
     * and return false if every element is distinct.
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> values = new HashSet<>();
        for (int num :
                nums) {
            if (!values.add(num)) {
                return true;
            }
            values.add(num);
        }
        return false;

    }
}
