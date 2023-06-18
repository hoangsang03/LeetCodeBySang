package Test_Top_Interview_Questions;

import Codility.Test2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test2Test {
    Test2 obj = new Test2();

    @Test
    public void testSolution_1 () {
        String P = "abc";
        String Q = "bcd";
        int actual = obj.solution(P,Q);
        int expected = 2;

        assertEquals(expected,actual);

    }
    @Test
    public void testSolution_2 () {
        String P = "axxz";
        String Q = "yzwy";
        int actual = obj.solution(P,Q);
        int expected = 2;

        assertEquals(expected,actual);

    }
    @Test
    public void testSolution_3 () {
        String P = "bacad";
        String Q = "abada";
        int actual = obj.solution(P,Q);
        int expected = 1;

        assertEquals(expected,actual);

    }
    @Test
    public void testSolution_4 () {
        String P = "amz";
        String Q = "amz";
        int actual = obj.solution(P,Q);
        int expected = 3;

        assertEquals(expected,actual);

    }
    @Test
    public void testSolution_5 () {
        String P = "aaaaaaa";
        String Q = "aaaaaaa";
        int actual = obj.solution(P,Q);
        int expected = 1;

        assertEquals(expected,actual);

    }
    @Test
    public void testSolution_6 () {
        String P = "aaaaaaa";
        String Q = "bbbbbbb";
        int actual = obj.solution(P,Q);
        int expected = 1;

        assertEquals(expected,actual);

    }


}
