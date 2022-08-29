package Top_Interview_Questions;

import java.util.Arrays;

/*14. Longest Common Prefix
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/longest-common-prefix/
 */
public class LeetCode14 {
    /*
     *Write a function to find the longest common prefix string amongst an array of strings.
     *If there is no common prefix, return an empty string "".
     *
     * Constraints:
        1 <= strs.length <= 200
        0 <= strs[i].length <= 200
        strs[i] consists of only lowercase English letters.
     */
    public String longestCommonPrefix(String[] strs) {
        char[] commonPrefix = new char[strs[0].length()];
        int lengthOfPrefix = 0;
        // strs has only one string element
        if (strs.length == 1) {
            return strs[0];
        }

        // strs has more than one element. Get common prefix of first two strings
        char[] arrTemp1 = new char[strs[0].length()];
        char[] arrTemp2 = new char[strs[1].length()];
        int smallerLength = Math.min(arrTemp1.length, arrTemp2.length);
        for (int i = 0; i < smallerLength; i++) {
            if (arrTemp1[i] == arrTemp2[i]) {
                commonPrefix[i] = arrTemp1[i];
                lengthOfPrefix++;
                continue;
            }
            // if the two characters are different -> stop
            break;
        }
        // after go out from for loop -> we'll have common prefix of first two strings
        // that's first of "lengthOfPrefix" characters in commonPrefix array
        // check it in remaining strings
        for (int i = 2; i < strs.length; i++) {
            lengthOfPrefix = Math.min(lengthOfPrefix, strs[i].length());
            // let check prefix in strs[i]
            arrTemp2 = strs[i].toCharArray();
            for (int j = 0; j < lengthOfPrefix ; j++) {
                if(commonPrefix[j] == arrTemp2[j]){
                    continue;
                }
                // there are "j" elements that's same
                lengthOfPrefix = j;
                break;
            }
            if(lengthOfPrefix == 0){
                return "";
            }
        }
        return new String(Arrays.copyOf(commonPrefix,lengthOfPrefix));
    }

}
