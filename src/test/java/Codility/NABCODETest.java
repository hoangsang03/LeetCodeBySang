package Codility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

public class NABCODETest {
    NABCODE obj = new NABCODE();

    @Test
    public void testSolution() {
        int[][] A = {{0,0,0,0},{0,0,1,0},{1,0,0,1}}; 
        int K = 2;
        // đay là test cases anh viết
        int expected = this.obj.solution(K,A);
        int actual = 2;

        assertEquals(expected,actual);
    }
    @Test
    public void testSolution_2() {
        int[][] A = {{0,1},{0,0}};
        int K = 1;
        int expected = this.obj.solution(K,A);
        int actual = 2;

        assertEquals(expected,actual);
    }
    @Test
    public void testSolution_3() {
        List<Integer> specificValues = List.of(0,1);

        int[][] random2DArray = createRandom2DArray(100, 100, specificValues);

        int[][] A = {{0,0,0,1},{0,1,0,0},{0,0,1,0},{1,0,0,0},{0,0,0,0}};
        int K = 4;
        long startTime = System.nanoTime();
        int expected = this.obj.solution(K,A);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("duration: " + duration);
        int actual = 8;

        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("test large input")
    public void testSolution_4() {
        List<Integer> specificValues = List.of(0,1);

        int[][] random2DArray = createRandom2DArray(100, 100, specificValues);

//        int[][] A = {{0,0,0,1},{0,1,0,0},{0,0,1,0},{1,0,0,0},{0,0,0,0}};
        int K = 4;
        long startTime = System.nanoTime();
//        int expected = this.obj.solution(K,A);
        int expected = this.obj.solution(K,random2DArray);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("duration: " + duration);
        int actual = 8;

        assertEquals(expected,actual);
    }

    private int[][] createRandom2DArray(int rows, int cols, List<Integer> specificValues) {
        int[][] array = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (random.nextBoolean()) {
                    int randomIndex = random.nextInt(specificValues.size());
                    array[i][j] = specificValues.get(randomIndex);
                } else {
                    // Generate random values not in the specificValues list
                    int randomValue;
                    do {
                        randomValue = random.nextInt();
                    } while (specificValues.contains(randomValue));

                    array[i][j] = randomValue;
                }
            }
        }

        return array;
    }


}
