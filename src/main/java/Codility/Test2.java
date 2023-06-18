package Codility;

import java.util.*;

public class Test2 {
    /**
     * We are given two strings P and Q, each consisting of N lowercase English letters. For each position in the strings, we have to choose one letter from either P or Q, in order to construct a new string S, such that the number of distinct letters in S is minimal. Our task is to find the number of distinct letters in the resulting string S.
     * <p>
     * For example, if P = "ca" and Q = "ab", S can be equal to: "ca", "cb", "aa" or "ab". String "aa" has only one distinct letter ('a'), so the answer is 1 (which is minimal among those strings).
     * <p>
     * Write a function:
     * <p>
     * class Solution { public int solution(String P, String Q); }
     * <p>
     * that, given two strings P and Q, both of length N, returns the minimum number of distinct letters of a string S, that can be constructed from P and Q as described above.
     * <p>
     * Examples:
     * <p>
     * 1. Given P = "abc", Q = "bcd", your function should return 2. All possible strings S that can be constructed are: "abc", "abd", "acc", "acd", "bbc", "bbd", "bcc", "bcd". The minimum number of distinct letters is 2, which be obtained by constructing the following strings: "acc", "bbc", "bbd", "bcc".
     * <p>
     * 2. Given P = "axxz", Q = "yzwy", your function should return 2. String S must consist of at least two distinct letters in this case. We can construct S = "yxxy", where the number of distinct letters is equal to 2, and this is the only optimal solution.
     * <p>
     * 3. Given P = "bacad", Q = "abada", your function should return 1. We can choose the letter 'a' in each position, so S can be equal to "aaaaa".
     * <p>
     * 4. Given P = "amz", Q = "amz", your function should return 3. The input strings are identical, so the only possible S that can be constructed is "amz", and its number of distinct letters is 3.
     * <p>
     * Write an efficient algorithm for the following assumptions:
     * <p>
     * N is an integer within the range [1..200,000];
     * strings P and Q are both of length N;
     * strings P and Q are made only of lowercase letters (a−z);
     * strings P and Q contain a total of at most 20 distinct letters.
     * @param P : string
     * @param Q : string
     * @return : number of distinct character
     */
    public int solution(String P, String Q) {
        char[] pArr = P.toCharArray();
        char[] qArr = Q.toCharArray();

        //printArray(pArr);
        //printArray(qArr);
        HashMap<Character, Integer> characterAppearances = countNumberApperances(pArr, qArr);
        printHashMap(characterAppearances);

        Character priorityChar;
        Set<Character> distinctChar = new HashSet<>();
        //System.out.println();
//        HashMap<Character,Integer> watingListChar = new HashMap<>();
        char c1;
        char c2;
        List<Character[]> holdCharSameAppearance = new ArrayList<>();
        for (int i = 0; i < pArr.length; i++) {
            c1 = pArr[i];
            c2 = qArr[i];
            if (!isOneOfDifferentTwoExist(distinctChar, c1, c2)) {
                priorityChar = getPriorityChar(characterAppearances, c1, c2, holdCharSameAppearance);
                if (priorityChar != null) {
                    distinctChar.add(priorityChar);
                }
            }

        }
        return distinctChar.size() + checkRemainingPairCharacter(holdCharSameAppearance, distinctChar);
    }

    /**
     * @param holdCharSameAppearance : a list contains  list of 2 element Character Array
     * @param distinctChar           : a set contains distinct character
     * @return number remaing distinct character
     */
    private int checkRemainingPairCharacter(List<Character[]> holdCharSameAppearance, Set<Character> distinctChar) {
        Character[] c;
        Iterator<Character[]> iterator = holdCharSameAppearance.iterator();

        while (iterator.hasNext()) {
            c = iterator.next();
            if (distinctChar.contains(c[0]) || distinctChar.contains(c[1])) {
                iterator.remove();
            }
        }
        countNumberApperances(holdCharSameAppearance);
        return (countNumberApperances(holdCharSameAppearance) + 1) / 2;
    }

    private int countNumberApperances(List<Character[]> holdCharSameAppearance) {
        Set<Character> distinctChar = new HashSet<>();
        for (Character[] c : holdCharSameAppearance
        ) {
            distinctChar.addAll(List.of(c));
        }
        return distinctChar.size();
    }

    private Character getPriorityChar(HashMap<Character, Integer> characterApperances, char c1, char c2, List<Character[]> holdCharSameAppearance) {
        int num1;
        int num2;

        num1 = characterApperances.get(c1);
        num2 = characterApperances.get(c2);
        if (num1 == num2) {
            holdCharSameAppearance.add(new Character[]{c1, c2});
            return null;
        } else if (num1 > num2) {
            characterApperances.put(c2, num2 - 1);
            return c1;
        } else {
            characterApperances.put(c1, num1 - 1);
            return c2;
        }
    }

    private HashMap<Character, Integer> countNumberApperances(char[] pArr, char[] qArr) {
        HashMap<Character, Integer> characterAppearances = new HashMap<>();
        int len = pArr.length;

        for (int i = 0; i < len; i++) {
            if (pArr[i] != qArr[i]) {
                // update 2
                increaseNumberOfApperance(characterAppearances, pArr[i]);
                increaseNumberOfApperance(characterAppearances, qArr[i]);
            } else {
                // update 1
                increaseNumberOfApperance(characterAppearances, pArr[i]);
            }
        }
        return characterAppearances;
    }


    private void increaseNumberOfApperance(HashMap<Character, Integer> characterApperances, char c) {
        if (characterApperances.containsKey(c)) {
            characterApperances.put(c, characterApperances.get(c) + 1);
        } else {
            characterApperances.put(c, 1);
        }
    }

    private void printSetValue(Set<Character> s) {
        System.out.println(s.toString());
    }

    private void printHashMap(HashMap<Character, Integer> maps) {
        System.out.println(maps.toString());
    }

    private void printArray(char[] arr) {
        System.out.print("\n[");
        for (char c : arr
        ) {
            System.out.print(c + ",");
        }
        System.out.print("]\n");
    }


    private boolean isOneOfDifferentTwoExist(Set<Character> distinctChar, char c, char c1) {
        if (distinctChar.contains(c) || distinctChar.contains(c1)) {
            return true;
        } else if (c == c1) {
            distinctChar.add(c);
            return true;
        } else {
            return false;
        }
    }

}
