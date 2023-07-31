package TopInterview150Test;

import TopInterview150.Leetcode88;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leetcode88Test {
    Leetcode88 obj = new Leetcode88();

    @Test
    public void GivenAnArray_AndValueIsBetween_GetRightPostion(){
        int[] num = {1,1,2,3,6,6,7,8,8,11,55,67,78,88};
        int value = 10;
        int expected = 9;
        int actual = obj.findSuitablePosition(value,num,0,num.length);

        assertEquals(expected,actual);
        System.out.println(num[actual-1]);
        System.out.println(num[actual]);
    }
    @Test
    public void GivenAnArray_AndValueIsGreaterThanLastElement(){
        int[] num = {1,1,2,3,6,6,7,8,8,11,55,67,78,88};
        int value = 100;
        int expected = 14;
        int actual = obj.findSuitablePosition(value,num,0,num.length-1);

        assertEquals(expected,actual);
        assertEquals(num[actual-1],num[num.length-1]);
        System.out.println(num[actual-1]);
    }
    @Test
    public void GivenAnArray_AndValueIsLessThanLastElement(){
        int[] num = {1,1,2,3,6,6,7,8,8,11,55,67,78,88};
        int value = 0;
        int expected = 0;
        int actual = obj.findSuitablePosition(value,num,0,num.length);

        assertEquals(expected,actual);
        assertEquals(num[actual],num[0]);
    }
    @Test
    public void insertNumIntoPutIndex(){
        int[] num = {1,1,2,3,6,6,7,8,8,11,55,67,78,88,0};
        int[] expected = {0,1,1,2,3,6,6,7,8,8,11,55,67,78,88};
        int value = 0;
        int putIndex = obj.findSuitablePosition(value,num,0,num.length-1);

        obj.insertNumIntoPutIndex(num,num.length-1,value,putIndex);
        assertArrayEquals(expected,num);
    }
    @Test
    public void testMerger(){
        int[] num1 = {1,1,2,3,6,6,7,8,8,11,55,67,78,88,0,0,0,0,0,0,0};
        int[] num2 = {6,7,8,8,11,55,100};
        int[] expected = {1,1,2,3,6,6,6,7,7,8,8,8,8,11,11,55,55,67,78,88,100};

        obj.merge(num1,14,num2,num2.length);
        assertEquals(expected.length,num1.length);
        assertArrayEquals(expected,num1);
    }
    @Test
    public void testMerger_oneElement(){
        int[] num1 = {0};
        int[] num2 = {6};
        int[] expected = {6};

        obj.merge(num1,0,num2,1);
        assertEquals(expected.length,num1.length);
        assertArrayEquals(expected,num1);
    }


}