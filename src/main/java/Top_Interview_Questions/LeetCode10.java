package Top_Interview_Questions;

/*
 *10. Regular Expression Matching
 * Difficulty: Hard
 * Link: https://leetcode.com/problems/regular-expression-matching/
 */
public class LeetCode10 {
    /**
     * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
     * '.' Matches any single character.
     * '*' Matches zero or more of the preceding element.
     * The matching should cover the entire input string (not partial).
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 20
     * 1 <= p.length <= 30
     * s contains only lowercase English letters.
     * p contains only lowercase English letters, '.', and '*'.
     * It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
     */
    public boolean isMatch(String s, String p) {
        char[] sArr = s.toCharArray();
        char[] pArr = processPattern(p);
        int iSArr = 0;
        int iPArr = 0;
        char pChar;

        while (iPArr < pArr.length) {
            pChar = pArr[iPArr];
            // after if else statement, pChar will be element which need to check in sArr
            // if pChar = '*' -> check next element == '*' -> next element
            // the case there are continued '*' elements -> get the last one
            if ((iPArr + 1 < pArr.length) && (pChar == '*' && pArr[iPArr + 1] == '*')) {
                iPArr++;
                continue;
            } // if pChar = '.' and next element = '*'
            else if ((iPArr + 1 < pArr.length) && (pChar == '.' && pArr[iPArr + 1] == '*')) {
                // the case that last two elements is '.*' : mean zero or more any characters
                if (iPArr + 2 == pArr.length) {
                    return true;
                } else {
                    iPArr += 2;
                    // get the character that is different '*' then check is it exist in sArr array ?
                    while (iPArr < pArr.length && pArr[iPArr] == '*') {
                        iPArr++;
                    }
                    // iPArr is index of first different character after '.*' in pArr array
                    pChar = pArr[iPArr];
                    // checking that is pArr[iPArr] exist in sArr array?
                    while (iSArr < sArr.length) {
                        if (pChar != sArr[iSArr]) {
                            iSArr++;
                            continue;
                        }
                        break;
                    }
                    // doesn't find pChar in sArr array -> false
                    if (iSArr == sArr.length) {
                        return false;
                    }
                    // found it
                    iSArr++;
                    iPArr++;
                    continue;
                }
            }
            // pChar is different {'.*'} and can be '*' , '.' or any characters
            if (iSArr == sArr.length) {
                // check remaining characters in pArr mean empty string
                while(iPArr + 1 < pArr.length && pArr[iPArr+1] == '*'){
                    iPArr++;
                }
                // if there are not any characters in sArr array to check AND pChar's value is '*'
                return iPArr == pArr.length - 1 && pArr[iPArr] == '*';
            } else {
                if (pChar == '.') {
                    iSArr++;
                } else if (pChar == '*') {
                    // check Does it equal preceding character ?
                    if (iSArr > 0 && sArr[iSArr] != sArr[iSArr - 1]) {
                        iPArr++;
                        continue;
                    }
                    //find fist next different value in sArr
                    // skip same characters
                    do {
                        iSArr++;
                    }
                    while (iSArr < sArr.length && sArr[iSArr] == sArr[iSArr - 1]);


                } else {
                    if (pChar == sArr[iSArr]) {
                        iSArr++;
                    } else {
                        iPArr++;
                        // it may be zero preceding element
                        if (pArr[iPArr] == '*') {
                            // get last '*' if there are many '*' elements
                            do {
                                iPArr++;
                            }
                            while ((iPArr + 1 < pArr.length) && (pArr[iPArr] == '*' && pArr[iPArr + 1] == '*'));
                            continue;
                        }
                        return false;
                    }
                }

            }
            iPArr++;

        }

        return iSArr == sArr.length && iPArr == pArr.length;

    }
    public char[] processPattern(String p) {
        int count;
        int iPArr = 0;
        char[] pArr = p.toCharArray();
        while (iPArr < pArr.length) {
            if (pArr[iPArr] == '*' || pArr[iPArr] == '.') {
                iPArr++;
                continue;
            }
            count = 0;
            // only check character that is different '*' and '.'
            for (int i = iPArr; i < pArr.length; i++) {
                // diferrent first and '*'
                if ((i == pArr.length - 1) || (pArr[i] != pArr[iPArr] && pArr[i] != '*')) {
                    // process
                    if (i - iPArr > count) {
                        // 'count' characters
                        if(i == pArr.length-1 ){
                            if(pArr[i] == pArr[iPArr]){
                                pArr[i] = '*';
                                count++;
                            }
                            // else no change
                        }
                        int j = iPArr;
                        while (count > 0) {
                            pArr[iPArr] = pArr[j];
                            count--;
                            iPArr++;
                        }
                        // need verify j + 1 < i
                        if (iPArr < i) {
                            pArr[iPArr] = pArr[j];
                            iPArr++;
                        }
                        // zero or more
                        while (iPArr < i) {
                            pArr[iPArr] = '*';
                            iPArr++;
                        }
                    }
                    iPArr++;
                    break;
                }
                if (i+1 < pArr.length && pArr[i] == pArr[iPArr] && pArr[i + 1] != '*') {
                    count++;
                }

            }
        }
        return pArr;
    }
}
