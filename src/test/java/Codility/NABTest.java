package Codility;

import org.junit.jupiter.api.Test;

public class NABTest {
    NAB obj = new NAB();

    @Test
    public void testSolution(){
        int[] P = {4,4,2,4};
        int[] S = {5,5,2,5};
        this.obj.solution(P,S);
    }

}
