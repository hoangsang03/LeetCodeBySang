package Top_Interview_Questions;

import java.util.HashMap;

/**
 * Title: 859. Buddy Strings
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/buddy-strings/
 */
public class LeetCode859 {

    /**
     * Given two strings s and goal, return true if you can swap two letters in s
     * so the result is equal to goal, otherwise, return false.
     * Swapping letters is defined as taking two indices i and j (0-indexed)
     * such that i != j and swapping the characters at s[i] and s[j].
     * For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
     * Constraints:
     * 1 <= s.length, goal.length <= 2 * 104
     * s and goal consist of lowercase letters.
     */
    public boolean buddyStrings(String s, String goal) {
        /*
         * records will save these things :
         * 1. different values between s and goal with key
         *       that is '1' and '2' for first different pair
         * 2. Character of s and default value
         *
         */
        HashMap<Character, Character> records = new HashMap<>();
        int count = 0;
        boolean duplicateChar = false;
        if (s.length() != goal.length()) {
            return false;
        }

        // compare and record information into records map
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (count >= 4) {
                    return false;
                }
                count++;
                // convert int (0 - 9) to char
                records.put((char) ('0' + count), s.charAt(i));
                count++;
                records.put((char) ('0' + count), goal.charAt(i));
            } else if (records.get(s.charAt(i)) != null) {
                duplicateChar = true;
            } else {
                records.put(s.charAt(i), '1');
            }
        }

        // if there are two different pairs -> check that Could it swap with right condition?
        if (count == 4) {
            return records.get('1') == records.get('4') &&
                    records.get('2') == records.get('3');
        }
        // if there aren't any different character between two strings and
        // there is at least one character that
        // apperance more than one time in s string
        return count == 0 && duplicateChar ? true : false;
    }
}
