package Interview;

public class NABTEST_1 {
    public int solution(String S) {
        // N in [1..100]
        // loop S, each car => get total camera

        char[] streetChar = S.toCharArray();
        int numSpeedCam;
        int totalTimes = 0;
        for (int i = 0; i < streetChar.length ; i++) {
            numSpeedCam = 0;
            if(streetChar[i] == '>'){
                // countRightSpeedCam
                numSpeedCam = getNumRightCam(i,streetChar);
            } else if (streetChar[i] == '<') {
                // countLeftSpeedCam
                numSpeedCam = getNumLeftCam(i,streetChar);
            }
            totalTimes += numSpeedCam;
        }

        return totalTimes;


    }

    private int getNumLeftCam(int index, char[] streetChar) {
        // check first index
        if(index < 1){
            return 0;
        }
        int numSpeedCam = 0;
        for (int i = index - 1; i >= 0; i--) {
            if(streetChar[i] == '.'){
                numSpeedCam++;
            }
        }
        return numSpeedCam;
    }

    private int getNumRightCam(int index, char[] streetChar) {
        // check last index
        if(index == streetChar.length - 1){
            return 0;
        }
        int numSpeedCam = 0;
        for (int i = index + 1; i < streetChar.length; i++) {
            if(streetChar[i] == '.'){
                numSpeedCam++;
            }
        }
        return numSpeedCam;
    }
}
