package Top_Interview_Questions;

/*
 * Difficulty: Easy
 * Link : https://leetcode.com/problems/plus-one/
 */
public class LeetCode66 {
    /*
     * You are given a large integer represented as an integer array digits, where
     * each digits[i] is the ith digit of the integer. The digits are ordered from
     * most significant to least significant in left-to-right order. The large
     * integer does not contain any leading 0's.
     *
     * Increment the large integer by one and return the resulting array of digits.
     * Constraints:
     *
     * 1 <= digits.length <= 100 0 <= digits[i] <= 9 digits does not contain any
     * leading 0's.
     */

    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i > -1 && digits[i] + 1 > 9) {
            i--;
        }

        // digits.length > i > 0
        if (0 <= i) {
            digits[i]++;
            // set digits[j] = 0 | i < j < digits.lenth
            while (i < digits.length - 1) {
                i++;
                digits[i] = 0;
            }
            return digits;
        }
        // in this case every digit is ine
        else {

            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int j = 1; j < result.length; j++) {
                result[j] = 0;
            }
            return result;
        }

    }

}
