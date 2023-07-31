package TopInterview150;
/**
 * {@code @Author:} hoangsang03 <br>
 * Title: 88. Merge Sorted Array <br>
 * Level: <b>Easy</b> <br>
 * Link: <a href="https://leetcode.com/problems/merge-sorted-array/">LeetCode88</a>
 * <br>Keyword: 2-poiters;two-pointers
 */
public class Leetcode27 {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return  k;
    }
}
