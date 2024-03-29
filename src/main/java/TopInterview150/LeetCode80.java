package TopInterview150;

/**
 * {@code @Author:} hoangsang03 <br>
 * Title: 80. Remove Duplicates from Sorted Array II <br>
 * Level: <b>Medium</b> <br>
 * Link: <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150">LeetCode80</a>
 * <br>Doc: <a href="https://www.geeksforgeeks.org/arrays-in-java/">arrays-in-java</a>
 */
public class LeetCode80 {
    public int bigO = 0;

    /**
     * Given an integer array nums sorted in <b>non-decreasing order</b>,
     * remove some duplicates in-place such that
     * each unique element appears at <b>most twice</b>.
     * <i>The <b>relative order</b> of the elements should be kept the same</i>.
     * <br>
     * Since it is impossible to change the length of the array in some languages,
     * you must instead have the <b>result be placed in the first part</b> of the array nums.
     * More formally, if there are k elements after removing the duplicates,
     * then the <b>first k elements</b> of nums should hold the <b>final result</b>.
     * It does not matter what you leave beyond the first k elements.
     * <br>
     * <b>Return k</b> after placing the final result in the first k slots of nums.
     * <br>
     * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
     * <br> <br>
     * Constraints:
     * <br>
     * 1 <= nums.length <= 3 * 10^4 <br>
     * -10^4 <= nums[i] <= 10^4 <br>
     * nums is sorted in <b>non-decreasing order</b>. <br>
     *
     * @param nums : non-decreasing array
     * @return Return k : <b>first k elements</b> of nums should hold the <b>final result</b>
     */
    public int removeDuplicates(int[] nums) {
        int numberAppearances;
        int k = -1;
        for (int i = 0; i < nums.length; i += numberAppearances) {
            numberAppearances = countNumberValueThatOccursInArrays(i, nums[i], nums);
            k++;
            nums[k] = nums[i];
            if (numberAppearances >= 2) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }

    public int countNumberValueThatOccursInArrays(int iStart, int value, int[] nums) {
        int count = 1;
        for (int j = iStart + 1; j < nums.length; j++) {
            bigO++;
            if (nums[j] == value) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

}
