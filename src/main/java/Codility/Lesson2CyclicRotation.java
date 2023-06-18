package Codility;

public class Lesson2CyclicRotation {

    public int[] solution(int[] A, int K) {
        int N = A.length;
        if(N < 2){
            return A;
        }
        K = K % N;
        if(K == 0){
            return A;
        }
        final int startIndex = 0;


        int currentIndex = startIndex;
        int currentValue = A[currentIndex];
        int holdValue;
        int nextIndex = -1;

        while (nextIndex != startIndex){
            nextIndex = (currentIndex + K) % N;
            holdValue = A[nextIndex];

            A[nextIndex] = currentValue;
            currentIndex = nextIndex;
            currentValue = holdValue;

        }
        return A;
    }
}
