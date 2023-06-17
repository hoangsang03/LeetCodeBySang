package Codility;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class Test1 {
    /**
     * A non-empty array A consisting of N integers is given.
     *
     * Array A represents a linked list. A list is constructed from this array as follows:
     *
     * the first node (the head) is located at index 0; => first node is A[0]
     * the value of a node located at index K is A[K];  => value of node is A[i]
     * if the value of a node is −1 then it is the last node of the list; A[i] = -1 => last node
     * otherwise, the successor of a node located at index K is located at index A[K]
     * (you can assume that A[K] is a valid index, that is 0 ≤ A[K] < N).
     * <br>
     * Condition:
     * N is an integer within the range [1..200,000];
     * each element of array A is an integer within the range [−1..N-1];
     * it will always be possible to construct the list and its length will be finite.
     */

    //private static Logger logger = LoggerFactory.getLogger(Test1.class);
    public int solution(int[] A) {
        // Implement your solution here
        int length = 0;
        int KIndex = 0;
        while(A[KIndex] != -1){
            length++;
            System.out.println(KIndex + ":"+A[KIndex]);
            KIndex = A[KIndex];
            //log.debug("KIndex: " + KIndex);
        }
        // must add one more for last node
        System.out.println(KIndex + ":"+A[KIndex]);
        length++;
        return length;
    }
}
