package Test_Top_Interview_Questions;

import Top_Interview_Questions.SpecialTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialTest_Test {
    SpecialTest obj = new SpecialTest();

    @Test
    public void testSolution_1 () {
        assertEquals(8, obj.solution("4 5 6 - 7 +"));
    }
    @Test
    public void testSolution_2 () {
        assertEquals(7, obj.solution("13 DUP 4 POP 5 DUP + DUP + -"));
    }
    @Test
    public void testSolution_3 () {
        assertEquals(-1, obj.solution("5 6 + -"));
    }
    @Test
    public void testSolution_4 () {
        assertEquals(-1, obj.solution("3 DUP 5 - -"));
    }
    @Test
    public void testSolution_5 () {
        assertEquals(-1, obj.solution("1048575 DUP +"));
    }

    @Test
    public void testSolution_6 () {
        assertEquals(-1, obj.solution("+ 1048575 DUP +"));
    }

    @Test
    public void testSolution_7 () {
        assertEquals(-1, obj.solution("- 1048575 DUP +"));
    }

    @Test
    public void testSolution_8 () {
        assertEquals(-1, obj.solution("POP 1048575 DUP +"));
    }

    @Test
    public void testSolution_9 () {
        assertEquals(-1, obj.solution("1 + 1048575 DUP +"));
    }

    @Test
    public void testSolution_10 () {
        assertEquals(-1, obj.solution("2 - 1048575 DUP +"));
    }

    @Test
    public void testSolution_11 () {
        assertEquals(-1, obj.solution("3 POP 1048575 DUP +"));
    }

    @Test
    public void testSolution_12 () {
        assertEquals(2, obj.solution("1048575 1 DUP +"));
    }

    @Test
    public void testSolution_13 () {
        assertEquals(1048575, obj.solution("2 1048575 DUP"));
    }

    @Test
    public void testSolution_14 () {
        assertEquals(0, obj.solution("3 POP 1048575 DUP -"));
    }

    @Test
    public void testSolution_15 () {
        assertEquals(-1, obj.solution("0 0 + 0 2 0 -"));
    }


}
