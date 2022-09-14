package Top_Interview_Questions;


import java.util.HashSet;

public class DemoOfCodilityTest {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet checkList = new HashSet();
        int maxOfA = A[0];
        for (int value : A) {
            checkList.add(value);

        }
        // find smallest
        for (int i = 1; i < checkList.size() + 2; i++) {
            if (!checkList.contains(i)) {
                return i;
            }
        }
        // if return -1, it means the function work incorrectly
        return -1;
    }

    public static String solution_2(String s) {
        char c = s.charAt(0);
        if ('A' <= c && c <= 'Z'){  // please fix condition
            return "upper";
        } else if ('a' <= c && c <= 'z') {  // please fix condition
            return "lower";
        } else if ('0' <= c && c <= '9') {  // please fix condition
            return "digit";
        } else {
            return "other";
        }
    }
}
