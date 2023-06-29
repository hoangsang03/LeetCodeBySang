package Interview;

public class NABTEST_3 {
    public int solution(int[] A) {
        // find max postion's value
        // find min postion's value

        if (A.length == 1) {
            return 1;
        } else if(A.length == 2){
            return A[1] - A[0];
        }

        int shortestBoardLength = 0;
        int maxPostionValue = -1;
        int minPostionValue = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            // find max postion's value
            if(A[i] > maxPostionValue){
                maxPostionValue = A[i];
            }
            // find min postion's value
            if(A[i] < minPostionValue){
                minPostionValue = A[i];
            }
        }
        double mediumValue = (maxPostionValue + minPostionValue);
        int greaterMediumValue = getClosestGreaterMediumValue(mediumValue,A);
        int lessMediumValue = getClosestLessMediumValue(mediumValue,A);
        
        int length1 = maxPostionValue - greaterMediumValue;
        int length2 = lessMediumValue - minPostionValue;
        shortestBoardLength = length1 > length2 ? length1 : length2;

        System.out.println("max: " + maxPostionValue);
        System.out.println("min: " + minPostionValue);
        System.out.println("medium: " + mediumValue);
        System.out.println("greaterMediumValue: " + greaterMediumValue);
        System.out.println("lessMediumValue: " + lessMediumValue);

        return shortestBoardLength;
    }

    private int getClosestLessMediumValue(double mediumValue, int[] a) {
        int result = (int) mediumValue;
        for (int i = 0; i < a.length; i++) {
            if(a[i] < mediumValue){
                result = a[i];
                for (int j = i+1; j < a.length; j++) {
                    if(a[j] < mediumValue && a[j] > result){
                        result = a[j];
                    }
                }
            }
        }
        return result;
    }

    private int getClosestGreaterMediumValue(double mediumValue, int[] a) {
        int result = (int) mediumValue;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > mediumValue){
                result = a[i];
                for (int j = i+1; j < a.length; j++) {
                    if(a[j] > mediumValue && a[j] < result){
                        result = a[j];
                    }
                }
            }
        }
        return result;
    }
}
