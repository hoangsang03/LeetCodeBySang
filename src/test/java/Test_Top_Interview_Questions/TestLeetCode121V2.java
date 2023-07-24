package Test_Top_Interview_Questions;

import Top_Interview_Questions.LeetCode121V2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestLeetCode121V2 {
    LeetCode121V2 obj = new LeetCode121V2();

    @Test
    public void testMaxProfit() {
        int[] prices = {3, 1, 4, 5, 3, 2, 7};
        int expected = 6;
        int actual = obj.maxProfit(prices);

        System.out.println("prices.length: " + prices.length);
        System.out.println("bigO: " + obj.BigO);
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void testMaxProfit_7() {
        int[] prices = {7,6,5,4,3,1};
        int expected = 0;
        int actual = obj.maxProfit(prices);

        System.out.println("prices.length: " + prices.length);
        System.out.println("bigO: " + obj.BigO);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testMaxProfit_2() {
        int[] prices = {3, 10, 2, 5, 3, 2, 7};
        int expected = 7;
        int actual = obj.maxProfit(prices);

        System.out.println("prices.length: " + prices.length);
        System.out.println("bigO: " + obj.BigO);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testMaxProfit_3() {
        int[] prices = {3, 10, 2, 5, 3, 2, 7, 3, 10, 2, 5, 3, 2, 7, 3, 10, 2, 5, 3, 2, 7, 3, 10, 2, 5, 3, 2, 7};
        int expected = 8;
        int actual = obj.maxProfit(prices);

        System.out.println("prices.length: " + prices.length);
        System.out.println("bigO: " + obj.BigO);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    @DisplayName("given decreasing array")
    public void testMaxProfit_4() {
        int[] prices = {100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85,
                84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67,
                66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49,
                48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31,
                30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13,
                12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int expected = 0;
        int actual = obj.maxProfit(prices);

        System.out.println("prices.length: " + prices.length);
        System.out.println("bigO: " + obj.BigO);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    @DisplayName("given decreasing array")
    public void testMaxProfit_8() {
        int[] prices = {854, 621, 289, 438, 679, 467, 102, 835, 290, 173, 981, 733, 739,
                913, 257, 627, 558, 137, 3, 529, 128, 498, 327, 439, 58, 205, 914, 350,
                523, 379, 328, 551, 759, 394, 840, 885, 827, 92, 198, 681, 43, 269, 510,
                784, 610, 457, 35, 335, 482, 373, 960, 429, 618, 639, 524, 471, 721, 718,
                268, 923, 418, 548, 879, 275, 108, 949, 580, 89, 729, 841, 162, 96, 914,
                737, 773, 482, 940, 942, 551, 819, 824, 312, 709, 924, 304, 418, 507,
                270, 936, 84, 284, 877, 616, 459, 259, 762, 840, 122, 42, 29, 646, 471,
                464, 927};
        int expected = 957;
        int actual = obj.maxProfit(prices);

        System.out.println("prices.length: " + prices.length);
        System.out.println("bigO: " + obj.BigO);
        Assertions.assertEquals(expected, actual);


    }
    @Test
    @DisplayName("given 100 random element  array")
    public void testMaxProfit_5() {
        int[] prices = {854, 621, 289, 438, 679, 467, 102, 835, 290, 173, 981, 733, 739,
                913, 257, 627, 558, 137, 1100,3, 529, 128, 498, 327, 439, 58, 205, 914, 350,
                523, 379, 328, 551, 759, 394, 840, 885, 827, 92, 198, 681, 43, 269, 510,
                784, 610, 457, 35, 335, 482, 373, 960, 429, 618, 639, 524, 471, 721, 718,
                268, 923, 418, 548, 879, 275, 108, 949, 580, 89, 729, 841, 162, 96, 914,
                737, 773, 482, 940, 942, 551, 819, 824, 312, 709, 924, 304, 418, 507,
                270, 936, 84, 284, 877, 616, 459, 259, 762, 840, 122, 42, 29, 646, 471,
                464, 927};
        int expected = 998;
        long startTime = System.nanoTime();
        int actual = obj.maxProfit(prices);
        long endTime = System.nanoTime();
        long duration = (endTime-startTime);
        System.out.println("duration: " + duration + " nanoseconds");

        System.out.println("prices.length: " + prices.length);
        System.out.println("bigO: " + obj.BigO);
        Assertions.assertEquals(expected, actual);


    }
    @Test
    @DisplayName("given 100 random element  array")
    public void testMaxProfit_6() {
        int[] prices = {854, 621, 289, 438, 679, 467, 102, 835, 290, 173, 981, 733, 739,
                913, 257, 627, 558, 137, 3, 529, 128, 498, 327, 439, 58, 205, 914, 350,
                523, 379, 328, 551, 759, 394, 840, 885, 827, 92, 198, 681, 43, 269, 510,
                784, 610, 457, 35, 335, 482, 373, 960, 429, 618, 639, 524, 471, 721, 718,
                268, 923, 418, 548, 879, 275, 108, 949, 580, 89, 729, 841, 162, 96, 914,
                737, 773, 482, 940, 942, 551, 819, 824, 312, 709, 924, 304, 418, 507,
                270, 936, 84, 284, 877, 616, 459, 259, 762, 840, 122, 42, 29, 646, 471,
                464, 927,
                854, 621, 289, 438, 679, 467, 102, 835, 290, 173, 981, 733, 739,
                913, 257, 627, 558, 137, 3, 529, 128, 498, 327, 439, 58, 205, 914, 350,
                523, 379, 328, 551, 759, 394, 840, 885, 827, 92, 198, 681, 43, 269, 510,
                784, 610, 457, 35, 335, 482, 373, 960, 429, 618, 639, 524, 471, 721, 718,
                268, 923, 418, 548, 879, 275, 108, 949, 580, 89, 729, 841, 162, 96, 914,
                737, 773, 482, 940, 942, 551, 819, 824, 312, 709, 924, 304, 418, 507,
                270, 936, 84, 284, 877, 616, 459, 259, 762, 840, 122, 42, 29, 646, 471,
                464, 927,
                854, 621, 289, 438, 679, 467, 102, 835, 290, 173, 981, 733, 739,
                913, 257, 627, 558, 137, 3, 529, 128, 498, 327, 439, 58, 205, 914, 350,
                523, 379, 328, 551, 759, 394, 840, 885, 827, 92, 198, 681, 43, 269, 510,
                784, 610, 457, 35, 335, 482, 373, 960, 429, 618, 639, 524, 471, 721, 718,
                268, 923, 418, 548, 879, 275, 108, 949, 580, 89, 729, 841, 162, 96, 914,
                737, 773, 482, 940, 942, 551, 819, 824, 312, 709, 924, 304, 418, 507,
                270, 936, 84, 284, 877, 616, 459, 259, 762, 840, 122, 42, 29, 646, 471,
                464, 927,
                854, 621, 289, 438, 679, 467, 102, 835, 290, 173, 981, 733, 739,
                913, 257, 627, 558, 137, 3, 529, 128, 498, 327, 439, 58, 205, 914, 350,
                523, 379, 328, 551, 759, 394, 840, 885, 827, 92, 198, 681, 43, 269, 510,
                784, 610, 457, 35, 335, 482, 373, 960, 429, 618, 639, 524, 471, 721, 718,
                268, 923, 418, 548, 879, 275, 108, 949, 580, 89, 729, 841, 162, 96, 914,
                737, 773, 482, 940, 942, 551, 819, 824, 312, 709, 924, 304, 418, 507,
                270, 936, 84, 284, 877, 616, 459, 259, 762, 840, 122, 42, 29, 646, 471,
                464, 927,
                854, 621, 289, 438, 679, 467, 102, 835, 290, 173, 981, 733, 739,
                913, 257, 627, 558, 137, 3, 529, 128, 498, 327, 439, 58, 205, 914, 350,
                523, 379, 328, 551, 759, 394, 840, 885, 827, 92, 198, 681, 43, 269, 510,
                784, 610, 457, 35, 335, 482, 373, 960, 429, 618, 639, 524, 471, 721, 718,
                268, 923, 418, 548, 879, 275, 108, 949, 580, 89, 729, 841, 162, 96, 914,
                737, 773, 482, 940, 942, 551, 819, 824, 312, 709, 924, 304, 418, 507,
                270, 936, 84, 284, 877, 616, 459, 259, 762, 840, 122, 42, 29, 646, 471,
                464, 927,
                854, 621, 289, 438, 679, 467, 102, 835, 290, 173, 981, 733, 739,
                913, 257, 627, 558, 137, 3, 529, 128, 498, 327, 439, 58, 205, 914, 350,
                523, 379, 328, 551, 759, 394, 840, 885, 827, 92, 198, 681, 43, 269, 510,
                784, 610, 457, 35, 335, 482, 373, 960, 429, 618, 639, 524, 471, 721, 718,
                268, 923, 418, 548, 879, 275, 108, 949, 580, 89, 729, 841, 162, 96, 914,
                737, 773, 482, 940, 942, 551, 819, 824, 312, 709, 924, 304, 418, 507,
                270, 936, 84, 284, 877, 616, 459, 259, 762, 840, 122, 42, 29, 646, 471,
                464, 927,
                854, 621, 289, 438, 679, 467, 102, 835, 290, 173, 981, 733, 739,
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
        System.out.println("bigO: " + obj.BigO);
        Assertions.assertEquals(expected, actual);


    }
}
