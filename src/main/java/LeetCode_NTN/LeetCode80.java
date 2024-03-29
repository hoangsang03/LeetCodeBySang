package LeetCode_NTN;

import java.util.Arrays;

/**
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
     * @param nums :
     * @return Return k : <b>first k elements</b> of nums should hold the <b>final result</b>
     */
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int indexValue;
        int indexNums = 0;
        for (int i = 0; i < nums.length; i += indexValue) {
            indexValue = count(i, nums[i], nums);
            nums[indexNums] = nums[i];
            indexNums++;
            if (indexValue >= 2) {
                nums[indexNums] = nums[i];
                indexNums++;
                count += 2;
            } else {
                count++;
            }
        }
        System.out.println("Arrays after change: " + Arrays.toString(nums));
        return count;
    }

    /**
     * requirement: count number remaining element after removing duplicates value <br>
     * <b>trans</b>: dem so luong phan tu con lai, sau khi xoa nhung gia tri lap lai nhieu hon <br>
     * 2 lan <br>
     * assignee : NTN
     *
     * @param nums EX: int[] nums = {0,0,0,1,1,2,2,3,3,3} => {0,0,1,1,2,2,3,3,*,*}
     *             return 8
     */
    public int countNumberRemainingValue(int[] nums) {
        int count = 0;
        int IndexValue;
        for (int i = 0; i < nums.length; i += IndexValue) {
            IndexValue = count(i, nums[i], nums);
            if (IndexValue >= 2) {
                count += 2;
            } else {
                count++;
            }
            System.out.println("big0 : " + this.bigO);

        }
        return count;
    }

    public int countNumberRemainingValue_Sang(int[] nums) {
        int numAppearances;
        int count = 0;
        for (int i = 0; i < nums.length; ) {
            numAppearances = countNumberValueThatOccursInArrays(i, nums[i], nums);
            if (numAppearances >= 2) {
                count += 2;
            }
            i += numAppearances;
            System.out.println("big0 : " + this.bigO);
        }
        return count;
    }

    /**
     * requirement: count number of value that occurs more than 2 times <br>
     * trans:  dem so luong phan tu no duoc lap lai nhieu hon 2 lan trong mang
     * assignee : NTN
     *
     * @param nums EX: int[] nums = {0,0,0,1,1,2,2,3,3,3} => return 2
     */
    public int countNumberValueThatOccursMoreThan2Times(int[] nums) {
        int count = 0;
        int IndexValue;
        for (int i = 0; i < nums.length; i += IndexValue) {
            IndexValue = count(i, nums[i], nums);
            if(IndexValue > 2) {
                count++;
            }

        }
        return count;
    }

    /**
     * overloading
     * @author : NHS
     * @param iStart :
     * @param value  :
     * @param nums   :
     * @return :
     */
    public int countNumberValueThatOccursInArrays(int iStart, int value, int[] nums) {
        int count = 0;
        for (int j = iStart; j < nums.length; j++) {
            bigO++;
            if (nums[j] == value) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
    /**Hàm hỗ trợ countNumberValueThatOccursMoreThan2Times
     *assignee: NTN
     * @param nums :
     */
    public int count(int index, int value, int[] nums) {
        int count = 0;
        for (int j = index; j < nums.length; j++) {
            if (nums[j] == value) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
