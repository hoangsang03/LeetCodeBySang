package TestLeetCode121_NTN;

import LeetCode121_NTN.LeetCode121;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLeetCode121 {
    LeetCode121 obj = new LeetCode121();


        @Test
    public void testMaxProfit() {
        int[] prices = {3,10,2,5,3}; // n(n+1)/2 , n = prices.length - 1
        // 27*28/2
        int actual = obj.maxProfit(prices);
        int expected = 7;

        System.out.println("size: " + prices.length);
        System.out.println("Big: " + obj.BigO);
        assertEquals(expected, actual);

    }

    @Test
    public void testMaxProfit_2() {
        int[] prices = {3,10,2,5,3,2,7,3,10,2,5,3,2,7,3,10,2,5,3,2,7,3,10,2,5,3,2,7};
        // n(n+1)/2 = n^2 + n / 2 , n = prices.length - 1
        // 27*28/2
        int actual = obj.maxProfit(prices);
        int expected = 8;

        System.out.println("size1: " + prices.length);
        System.out.println("predictation: " + (prices.length-1)*(prices.length)/2);
        System.out.println("Big: " + obj.BigO);
        assertEquals(expected, actual);

    }
    @Test
    public void testMaxProfit_4() {
        int[] prices = {854, 621, 289, 438, 679, 467, 102,10, 835, 290, 173, 981, 733, 739,
                913, 257, 627, 558, 137, 3, 529, 128, 498, 327, 439, 58, 205, 914, 350,
                523, 379, 328, 551, 759, 394, 840, 885, 827, 92, 198, 681, 43, 269, 510,
                784, 610, 457, 35, 335, 482, 373, 960, 429, 618, 639, 524, 471, 721, 718,
                268, 923, 418, 548, 879, 275, 108, 949, 580, 89, 729, 841, 162, 96, 914,
                737, 773, 482, 940, 942, 551, 819, 824, 312, 709, 924, 304, 418, 507,
                270, 936, 84, 284, 877, 616, 459, 259, 762, 840, 122, 42, 29, 646, 471,
                464, 927};
        // n(n+1)/2 = n^2 + n / 2 , n = prices.length - 1
        // 27*28/2
        int actual = obj.maxProfit(prices);
        int expected = 971;

        System.out.println("size1: " + prices.length);
        System.out.println("predictation: " + (prices.length-1)*(prices.length)/2);
        System.out.println("Big: " + obj.BigO);
        assertEquals(expected, actual);

    }
    @Test
    public void testMaxProfit_3() {
        int[] prices = {854, 621, 289, 438, 679, 467, 102, 835, 290, 173, 981, 733, 739,
                913, 257, 627, 558, 137, 3, 529, 128, 498, 327, 439, 58, 205, 914, 350,
                523, 379, 328, 551, 759, 394, 840, 885, 827, 92, 198, 681, 43, 269, 510,
                784, 610, 457, 35, 335, 482, 373, 960, 429, 618, 639, 524, 471, 721, 718,
                268, 923, 418, 548, 879, 275, 108, 949, 580, 89, 729, 841, 162, 96, 914,
                737, 773, 482, 940, 942, 551, 819, 824, 312, 709, 924, 304, 418, 507,
                270, 936, 84, 284, 877, 616, 459, 259, 762, 840, 122, 42, 29, 646, 471,
                464, 927};
        int expected = 978;
        long startTime = System.nanoTime();
        int actual = obj.maxProfit(prices);
        long endTime = System.nanoTime();
        long duration = (endTime-startTime);
        System.out.println("duration: " + duration + " nanoseconds");

        System.out.println("prices.length: " + prices.length);
        // System.out.println("predict: " + (prices.length+1)*(prices.length)/2);
        System.out.println("bigO: " + obj.BigO);
        assertEquals(expected, actual);

    }
}
