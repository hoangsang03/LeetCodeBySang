package Codility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Test1Test {
    Test1 obj = new Test1();
    int actual;
    int expected;
    @BeforeEach
    void initVariable(){

    }

    @Test
    public void test_1(){
        int[] A = {1,4,-1,3,2};
        this.actual = obj.solution(A);
        this.expected = 4;
        Assertions.assertEquals(this.expected, this.actual);
    }
    @Test
    public void test_2(){
        int[] A = {0, -1};
        this.actual = obj.solution(A);
        this.expected = 2;
        Assertions.assertEquals(this.expected, this.actual);
    }
    @Test
    public void test_3(){
        int[] A = {1, 2, 3, 4, 5, -1};
        this.actual = obj.solution(A);
        this.expected = 6;
        Assertions.assertEquals(this.expected, this.actual);
    }
    @Test
    public void test_4(){
        int[] A = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1};
        this.actual = obj.solution(A);
        this.expected = 14;
        Assertions.assertEquals(this.expected, this.actual);
    }
    @Test
    public void test_5(){
        int[] A = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1};
        this.actual = obj.solution(A);
        this.expected = 11;
        Assertions.assertEquals(this.expected, this.actual);
    }
    @Test
    public void test_6(){
        int[] A = {3, 2, 1, 0, -1};
        this.actual = obj.solution(A);
        this.expected = 5;
        Assertions.assertEquals(this.expected, this.actual);
    }
    @Test
    public void test_7(){
        int[] A = {2, 0, 3, -1, 4, 1};
        this.actual = obj.solution(A);
        this.expected = 6;
        Assertions.assertEquals(this.expected, this.actual);
    }
    @Test
    public void test_8(){
        int[] A = {0, -1, 2, 1, -1, 4, -1, 3};
        this.actual = obj.solution(A);
        this.expected = 8;
        Assertions.assertEquals(this.expected, this.actual);
    }
    @Test
    @Disabled
    public void test_9(){
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, -1};
        this.actual = obj.solution(A);
        this.expected = 21;
        Assertions.assertEquals(this.expected, this.actual);
    }
    @Test
    @Disabled
    public void  test_10(){
        int[] A = {0, 1, 2, -1, 4, 5, 6, -1, 8, 9, 10, -1, 12, 13, 14, -1, 16, 17, 18, -1, 20};
        this.actual = obj.solution(A);
        this.expected = 21;
        Assertions.assertEquals(this.expected, this.actual);
    }
    @Test
    public void test_11(){
        int[] A = {1,4,-1,3,2};
        this.actual = obj.solution(A);
        this.expected = 4;
        Assertions.assertEquals(this.expected, this.actual);
    }
}
