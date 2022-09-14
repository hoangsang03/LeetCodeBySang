package Top_Interview_Questions;

import java.util.HashSet;

/*
 * Title:
 * Difficulty: Easy
 * Link:
 */
public class LeetCode771 {
    /*
     *You're given strings jewels representing the types of stones that are jewels,
     * and stones representing the stones you have.
     * Each character in stones is a type of stone you have.
     * You want to know how many of the stones you have are also jewels.
     *Letters are case-sensitive, so "a" is considered a different type of stone from "A".
     *
     * Constraints:

        1 <= jewels.length, stones.length <= 50
        jewels and stones consist of only English letters.
        All the characters of jewels are unique.
     */
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<>();
        int count = 0;
        // convert String jewels to Set
        for (Character type : jewels.toCharArray()) {
            jewelSet.add(type);
        }

        // check if type in stones is jewel type
        for (Character type : stones.toCharArray()) {
            if (jewelSet.contains(type)) {
                count++;
            }
        }
        return count;
    }

    /* Idea: String has indexOf method that has character parameter
     * Return -1 if character is not existent in String
     * Use 2 methos of String
     * 1. indexOf(Character char)
     * 2. chatAt(int index)
     */
    public int numJewelsInStonesOfOtherOne(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
