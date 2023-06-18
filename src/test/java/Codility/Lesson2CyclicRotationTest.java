package Codility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.*;


public class Lesson2CyclicRotationTest {
    Lesson2CyclicRotation obj = new Lesson2CyclicRotation();

    /**
     * Assume that:
     *
     * N and K are integers within the range [0..100];
     * each element of array A is an integer within the range [−1,000..1,000].
     *
     *
     * case 1: empty array
     * case 1.1: 1 element array
     * case 1.2: 2 elements array
     * case 2: 100 elements array
     * case 3: negative elements
     * case 4: K = 0
     * case 5: K = 100
     * case 6: K = 51
     * case 7: K = 52
     * case 8: K = N
     * case 9: array has one distinct int element
     */
    @Test
    public void testSolution_1(){
        int[] A = {};
        int K = 100;
        int[] expected = this.obj.solution(A,K);
        int[] actual = {};
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
    @Test
    public void testSolution_2(){
        int[] A = {1,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5};
        int K = 2;
        int[] expected = this.obj.solution(A,K);
        int[] actual = {4,5,1,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3};

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            if(expected[i] != actual[i]){
                System.out.println("expected[" + i + "]=" +expected[i]);
                System.out.println("actual[" + i + "]=" +actual[i]);
            }
            assertEquals(expected[i],actual[i]);
        }

    }
    @Test
    public void testSolution_3(){
        int[] A = {1,-2,-3,-4,-5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5};
        int K = 2;
        int[] expected = this.obj.solution(A,K);
        int[] actual = {4,5,1,-2,-3,-4,-5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3};

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
    @Test
    public void testSolution_4(){
        int[] A = {3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5};
        int K = 0;
        int[] expected = this.obj.solution(A,K);
        int[] actual = {3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5};

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
    @Test
    public void testSolution_5(){
        int[] A = {3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5};
        int K = 100;
//        System.out.println(A.length);
//        System.out.println(K % A.length);

        int[] expected = this.obj.solution(A,K);
        int[] actual = {2,3,4,5,2,3,4,5,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5}; // not check

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
    @Test
    public void testSolution_6(){
        int[] A = {3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5};
        int K = 51;
//        System.out.println(A.length);
//        System.out.println(K % A.length);
        int[] expected = this.obj.solution(A,K);
        int[] actual = {5,2,3,4,5,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4}; // not check

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
    @Test
    public void testSolution_7(){
        int[] A = {3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5};
        int K = 52;
//        System.out.println(A.length);
//        System.out.println(K % A.length);
        int[] expected = this.obj.solution(A,K);
        int[] actual = {4,5,2,3,4,5,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3}; // not check

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
    @Test
    public void testSolution_8(){
        int[] A = {3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5};
        int K = A.length;
        int[] expected = this.obj.solution(A,K);
        int[] actual = {3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5,2,3,4,5}; // not check

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
    @Test
    public void testSolution_9(){
        int[] A = {5,5,5,5,5,5,5,5,5,5,5,5,5};
        int K = A.length;
        int[] expected = this.obj.solution(A,K);
        int[] actual = {5,5,5,5,5,5,5,5,5,5,5,5,5};

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
    @Test
    public void testSolution_10(){
        int[] A = {0, 0, 0};
        int K = 1;
        int[] expected = this.obj.solution(A,K);
        int[] actual = {0, 0, 0};

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
    @Test
    public void testSolution_11(){
        int[] A = {3, 8, 9, 7, 6};
        int K = 64; // 61% 5 = 1
        int[] expected = this.obj.solution(A,K);
//        int[] actual = {9, 7, 6, 3, 8};
        int[] actual = {8, 9, 7, 6, 3};

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
    @Test
    public void testSolution_12(){
        int[] A = {1, 2, 3, 4};
        int K = 4;
        int[] expected = this.obj.solution(A,K);
        int[] actual = {1, 2, 3, 4};

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }




}
