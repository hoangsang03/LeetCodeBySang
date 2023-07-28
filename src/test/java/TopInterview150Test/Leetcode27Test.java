package TopInterview150Test;

import TopInterview150.Leetcode27;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode27Test {
    Leetcode27 obj = new Leetcode27();

    @Test
    public void GivenEmptyArray_RemovedElement(){
        int[] num = {};
        obj.removeElement(num,1);
        int[] expected = {};

        assertArrayEquals(expected,num);
    }
    @Test
    public void GivenNonEmptyArray_RemovedElement(){
        int[] num = {3,5,6,1,2,6,7};
        int value = 6;
        int k = obj.removeElement(num,value);
        int[] expectedArr = {3,5,7,1,2,6,7};
        int expected = num.length - 2;

        assertEquals(expected,k);
        assertArrayEquals(expectedArr,num);
    }
    @Test
    public void GivenNonEmptyArray_WithOnlyOneValue_RemovedElement(){
        int[] num = {6,6,6,6,6,6,6,6,6,6,6,6};
        int value = 6;
        int k = obj.removeElement(num,value);
        int[] expectedArr = {6,6,6,6,6,6,6,6,6,6,6,6};
        int expected = 0;

        assertEquals(expected,k);
        assertArrayEquals(expectedArr,num);
    }
    @Test
    public void GivenNonEmptyArray_WithNoValueElement_RemovedElement(){
        int[] num = {6,6,1,6,6,6,6,5,6,6,6,6,6,6};
        int value = 7;
        int k = obj.removeElement(num,value);
        int[] expectedArr = {6,6,1,6,6,6,6,5,6,6,6,6,6,6};
        int expected = num.length;

        assertEquals(expected,k);
        assertArrayEquals(expectedArr,num);
    }
    @Test
    public void GivenNonEmptyArray_With3distinct_RemovedElement(){
        int[] num = {6,6,1,6,6,6,6,5,6,6,6,6,6,6};
        int value = 6;
        int k = obj.removeElement(num,value);
        int[] expectedArr = {5,1,1,6,6,6,6,5,6,6,6,6,6,6};
        int expected = 2;

        assertEquals(expected,k);
        assertArrayEquals(expectedArr,num);
    }
}