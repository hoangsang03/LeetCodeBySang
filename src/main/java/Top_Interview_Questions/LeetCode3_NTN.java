package Top_Interview_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LeetCode3_NTN {
    /**
     * 3. Longest Substring Without Repeating Characters
     * Medium
     * Companies
     *
     * Given a string s, find the length of the longest substring without repeating
     * characters.
     *
     * Example 1:
     *
     * Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the
     * length of 3. Example 2:
     *
     * Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with the length
     * of 1. Example 3:
     *
     * Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke", with the
     * length of 3. Notice that the answer must be a substring, "pwke" is a
     * subsequence and not a substring.
     *
     * Constraints: 0 <= s.length <= 5 * 10^4 s consists of English letters, digits,
     * symbols and spaces.
     */
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int result = 0;
        List<Integer> containerCount = new ArrayList<>();
        List<Character> containerString = new ArrayList<>();
        if(s.isEmpty()) {
            return result;

        }else {
            if(s.equals(" ")) {
                return 1;
            }
            for (int i = 0; i < s.length(); i++) {
                if(!containerString.contains(s.charAt(i))) {
                    count++;
                    containerString.add(s.charAt(i));
                    if(i == s.length() -1) {
                        containerCount.add(count);
                    }
                }else {
                    containerCount.add(count);
                    count = 1;
                    containerString = new ArrayList<>();
                    containerString.add(s.charAt(i));
                }
            }
            Collections.sort(containerCount, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });

            result = containerCount.get(0);
        }
        return result;
    }
}
