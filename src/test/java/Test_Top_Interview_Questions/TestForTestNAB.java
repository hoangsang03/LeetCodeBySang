package Test_Top_Interview_Questions;

import Top_Interview_Questions.DemoOfCodilityTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTestNAB {
    DemoOfCodilityTest obj = new DemoOfCodilityTest();

    @Test
    public void testSolution() {
        int[] A = {1, 3, 6, 4, 1, 2};
        assertEquals(5, obj.solution(A));
    }

    @Test
    public void testSolution_2() {
        int[] A = {1, 3, 6, 4, 1, 2, 5};
        assertEquals(7, obj.solution(A));
    }

    @Test
    public void testSolution_3() {
        int[] A = {1, 3, 6, 4, 1, 2, 5, -1, 3};
        assertEquals(7, obj.solution(A));
    }

    @Test
    public void testSolution_4() {
        int[] A = {-1, -2, 0, -3};
        assertEquals(1, obj.solution(A));
    }

    @Test
    public void testSolution_5() {
        int[] A = {-1, -2, 0, -3};
        assertEquals(1, obj.solution(A));
    }

}
