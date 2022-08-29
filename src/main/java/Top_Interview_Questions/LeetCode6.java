package Top_Interview_Questions;

/*
 * Difficulty: Medium
 * 6. Zigzag Conversion
 * Link: https://leetcode.com/problems/zigzag-conversion/
 */
public class LeetCode6 {
    /*
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
     * of rows like this: (you may want to display this pattern in a fixed font for
     * better legibility)
     *
     * And then read line by line: "PAHNAPLSIIGYIR" Constraints:
     *
     * 1 <= s.length <= 1000 s consists of English letters (lower-case and
     * upper-case), ',' and '.'. 1 <= numRows <= 1000
     */
    public String convert(String s, int numRows) {
        // the case, one row has only one character
        if (s.length() <= numRows || numRows == 1) {
            return s;
        }

        char[] arrStr = s.toCharArray();
        char[] result = new char[s.length()];
        int indexRow = 0;
        int iResult = 0;
        int top = 0;
        int plus = 2 * (numRows - 1);

        // find first row
        while (top < arrStr.length) {
            result[iResult] = arrStr[top];
            top += plus;
            iResult++;
        }
        indexRow++;

        // find second row to last row
        while (indexRow < numRows - 1) {
            top = plus;
            result[iResult] = arrStr[indexRow];
            iResult++;
            while (indexRow + top < arrStr.length) {
                result[iResult] = arrStr[top - indexRow];
                iResult++;
                result[iResult] = arrStr[top + indexRow];
                top += plus;
                iResult++;
            }
            // check previous element
            if (top - indexRow < arrStr.length) {
                result[iResult] = arrStr[top - indexRow];
                iResult++;

            }

            indexRow++;
        }

        // find last row
        top = numRows - 1;
        while (top < arrStr.length) {
            result[iResult] = arrStr[top];
            top += plus;
            iResult++;
        }
        return new String(result);

    }
//	public String convert(String s, int numRows) {
//		// the case, one row has only one character
//		if (s.length() <= numRows || numRows == 1) {
//			return s;
//		}
//		
//		char[] arrStr = s.toCharArray();
//		char[] result = new char[s.length()];
//		int indexRow = 0;
//		int iResult = 0;
//		int top = 0;
//		int plus = 2 * (numRows - 1);
//		
//		// find first row
//		while (top < arrStr.length) {
//			result[iResult] = arrStr[top];
//			top += plus;
//			iResult++;
//		}
//		indexRow++;
//		
//		// find second row to last row
//		while (indexRow < numRows - 1) {
//			top = plus;
//			result[iResult] = arrStr[indexRow];
//			iResult++;
//			while (indexRow + top < arrStr.length) {
//				result[iResult] = arrStr[top - indexRow];
//				iResult++;
//				result[iResult] = arrStr[top + indexRow];
//				top += plus;
//				iResult++;
//			}
//			// check previous element
//			if (top - indexRow < arrStr.length) {
//				result[iResult] = arrStr[top - indexRow];
//				iResult++;
//				
//			}
//			
//			indexRow++;
//		}
//		
//		// find last row
//		top = numRows - 1;
//		while (top < arrStr.length) {
//			result[iResult] = arrStr[top];
//			top += plus;
//			iResult++;
//		}
//		return new String(result);
//		
//	}
}
