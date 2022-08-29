package Top_Interview_Questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * 13. Roman to Integer
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/roman-to-integer/
 */
public class LeetCode13 {
    private static final Map<String, Integer> referenceValue = new HashMap<String, Integer>();

    static {
        referenceValue.put("I", 1);
        referenceValue.put("V", 5);
        referenceValue.put("X", 10);
        referenceValue.put("L", 50);
        referenceValue.put("C", 100);
        referenceValue.put("D", 500);
        referenceValue.put("M", 1000);
        Collections.unmodifiableMap(referenceValue);
    }

    /*
     * Constraints:
     *
     * 1 <= s.length <= 15 s contains only the characters ('I', 'V', 'X', 'L', 'C',
     * 'D', 'M'). It is guaranteed that s is a valid roman numeral in the range
     * [1,3999].
     */
    public int romanToInt(String s) {
        char[] roman = s.toCharArray();
        int valueOfRoman = LeetCode13.referenceValue.get("" + roman[roman.length - 1]);

        for (int i = s.length() - 2; i >= 0; i--) {
            if (LeetCode13.referenceValue.get("" + roman[i]) >= LeetCode13.referenceValue.get("" + roman[i + 1])) {
                valueOfRoman += LeetCode13.referenceValue.get("" + roman[i]);
            } else {
                valueOfRoman -= LeetCode13.referenceValue.get("" + roman[i]);
            }

        }
        return valueOfRoman;
    }
}
