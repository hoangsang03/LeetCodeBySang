package TopInterview150;
/**
 * {@code @Author:} hoangsang03 <br>
 * Title: 26. Remove Duplicates from Sorted Array <br>
 * Level: <b>Easy</b> <br>
 * Link: <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array">Leetcode26</a>
 * */
public class Leetcode26 {
    public int removeDuplicatesV2(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            i = getNextDistinctValueIndex(i,nums);
            nums[k] = nums[i];
            k++;
        }
        return k;
    }
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]){
                nums[k] = nums[i];
                k++;
            }
        }
        nums[k] = nums[nums.length-1];
        k++;
        return k;
    }

    private int getNextDistinctValueIndex(int start, int[] nums) {
        for (int j = start; j < nums.length - 1; j++) {
            if(nums[j] != nums[j+1]){
                return j;
            }
        }
        return nums.length - 1;
    }
}
