package TopInterview150;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: 80. Remove Duplicates from Sorted Array II <br>
 * Level: Medium <br>
 * Link: <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150">...</a>
 */
public class LC80_RemoveDuplicatesFromSortedArrayII {
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
     * @param nums
     * @return Return k : <b>first k elements</b> of nums should hold the <b>final result</b>
     */
    public int removeDuplicates(int[] nums) {
        // count number of value that occurs more than 2 times
        // => dem so luong phan tu ma no duoc lap lai nhieu hon 2 lan trong mang
        countNumberValueThatOccursMoreThan2Times(nums);

        countNumberRemainingValue(nums);



        return 0;
    }

    /**
     * requirement: count number remaining element after removing duplicates value <br>
     * <b>trans</b>: dem so luong phan tu con lai, sau khi xoa nhung gia tri lap lai nhieu hon <br>
     * 2 lan <br>
     * assignee : NTN
     * @param nums
     * EX: int[] nums = {0,0,0,1,1,2,2,3,3,3} => {0,0,1,1,2,2,3,3,*,*}
     *         return 8
     */
    public int countNumberRemainingValue(int[] nums) {
    List<Integer> count = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if(!count.contains(nums[i])){
                if(countNumberValueThatOccursInArrays(nums[i],nums) >= 2){
                    count.add(nums[i]);
                    count.add(nums[i]);
                }else{
                    count.add(nums[i]);
                }
            }
        }
        return count.size();
    }

    /**
     * requirement: count number of value that occurs more than 2 times <br>
     * trans:  dem so luong phan tu ma no duoc lap lai nhieu hon 2 lan trong mang
     * assignee : NTN
     * @param nums
     * EX: int[] nums = {0,0,0,1,1,2,2,3,3,3} => return 2
     */
    public int countNumberValueThatOccursMoreThan2Times(int[] nums) {
        int result = 0;
        List<Integer> container = new ArrayList<>();
        for (int i = 0;i < nums.length; i++) {
            if(!container.contains(nums[i])) {
             if(countNumberValueThatOccursInArrays(nums[i],nums) > 2){
                 result++;
             }
             container.add(nums[i]);
            }
        }
        return result;
    }
    /**Hàm hỗ trợ countNumberValueThatOccursMoreThan2Times
    *assignee: NTN
     * @param nums
     */
    public int countNumberValueThatOccursInArrays(int i,int[] nums){
        int count = 0;
        for (int j = 0; j < nums.length; j++){
            if(nums[j] == i){
                count++;
            }
        }
        return count;
    }
}
