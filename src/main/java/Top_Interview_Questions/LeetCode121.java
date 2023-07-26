package Top_Interview_Questions;

import java.util.*;

/**
 * Title: 121. Best Time to Buy and Sell Stock
 * <br> Difficult: Easy
 * <br> Link: <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">best-time-to-buy-and-sell-stock</a>
 */
public class LeetCode121 {

    public int BigO = 0;

    /**
     * You are given an array prices where prices[i] is the price of a given stock
     * on the ith day.
     * <br>
     * You want to maximize your profit by choosing a single day to buy one stock and
     * choosing a different day in the future to sell that stock.
     * <br> <br>
     * Return the maximum profit you can achieve from this transaction.
     * If you cannot achieve any profit, return 0.
     *
     * <br>
     * Constraints:
     * <br>
     * 1 <= prices.length <= 105
     * 0 <= prices[i] <= 104
     * <br>
     * @param prices : prices of stock
     * @return : max profit if it has
     */


    public int maxProfit(int[] prices) {
        // find list min index and value
        List<Integer[]> minIndexAndValueList = findMinsIndex(prices);
        int maxValue;

        int maxProfit = 0;
        List<Integer[]> maxValuaMap = new ArrayList<>();
        int[] maxArr;
        for(Integer[] minArr : minIndexAndValueList) {
            BigO++;
            maxValue = isMaxValueExist(minArr[0], maxValuaMap);

            if(maxValue == -1){
                maxArr = findMaxValueAndIndex(minArr[0], prices);
                maxValue = maxArr[1];
                maxValuaMap.add(new Integer[]{maxArr[0],maxArr[1]});
            }

            if(maxValue - minArr[1] > maxProfit){
                maxProfit = maxValue - minArr[1];
            }
        }
        return maxProfit ;
    }



    private int isMaxValueExist(int minIndex, List<Integer[]> maxValueAndIndex) {
        int maxValue = -1;
        if(maxValueAndIndex.size() > 0){
            for (Integer[] maxArr : maxValueAndIndex) {
                BigO++;
                if(maxArr[0] > minIndex){
                    maxValue = maxArr[1];
                    break;
                }
            }
        }
        return maxValue;
    }

    /**
     * find all mins from left side to right side
     * @param prices :
     * @return : List of Integer 2-element array,
     * <br>1st element is index <br>
     * 2nd element is value at that index
     */
    private List<Integer[]> findMinsIndex(int[] prices) {
        List<Integer[]> mins = new ArrayList<>();
        int minIndex;
        int currentMinValue;

        // check whether first element is minimum point
        if( prices.length > 1 && prices[0] < prices[1]){
            currentMinValue = prices[0];
            mins.add(new Integer[]{0,prices[0]});
        } else {
            currentMinValue = Integer.MAX_VALUE;
        }

        for (int i = 1; i < prices.length - 1; i = minIndex + 1) {
            BigO++;
            minIndex = findNextFinalMinIndex(currentMinValue,i, prices);
            if(minIndex == prices.length) break;
            currentMinValue = prices[minIndex];
            mins.add(new Integer[]{minIndex,currentMinValue});
        }
        return mins;
    }

    /**
     *
     * @param previousMin : previous min or biggest integer
     * @param start : position relative after previousMin's index
     * @param prices : price array
     * @return : next min value or prices.length
     */
    private int findNextFinalMinIndex(int previousMin, int start, int[] prices) {
        int min = previousMin;
        for (int j = start; j < prices.length; j++) {
            BigO++;
            // got next min
            if (min > prices[j]) {
                min = prices[j];
                // find next sequence min if it has
                for (int i = j+1; i < prices.length; i++) {
                    BigO++;
                    if(min > prices[i]){
                        min = prices[i];
                    } else {
                        return i - 1;
                    }
                }
            }
        }
        // no have any min more
        return prices.length;
    }

    /**
     *
     * @param start : Index's starting to find max value
     * @param prices : price array
     * @return : new max value and index or the start's value and start index
     */
    private int[] findMaxValueAndIndex(int start, int[] prices){
        // "start" always is greater or equal 1
        int maxValue = prices[start];
        int maxIndex = start;
        for (int i = start + 1; i < prices.length; i++) {
            BigO++;
            if (maxValue < prices[i]) {
                maxValue = prices[i];
                maxIndex = i;
            }
        }
        return new int[]{maxIndex,maxValue};
    }
}
