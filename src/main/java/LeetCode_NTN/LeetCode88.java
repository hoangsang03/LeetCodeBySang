package LeetCode_NTN;

import java.util.Arrays;

/**
 * Title: Merge Sorted Array
 * <br> Level: Easy
 * <br> Link: <a href = "https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150"> LeetCode 88</a>
 */
public class LeetCode88 {
    public int big0;
    /**
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
     *<br> Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     * <br>The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     * <br>Example 1:
     * <br>Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * <br>Output: [1,2,2,3,5,6]
     * <br>Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
     * <br>The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
     * <br>Example 2:
     * <br>Input: nums1 = [1], m = 1, nums2 = [], n = 0
     * <br>Output: [1]
     * <br>Explanation: The arrays we are merging are [1] and [].
     * <br>The result of the merge is [1].
     * <br>Example 3:
     * <br>Input: nums1 = [0], m = 0, nums2 = [1], n = 1
     * <br>Output: [1]
     * <br>Explanation: The arrays we are merging are [] and [1].
     * <br>The result of the merge is [1].
     * <br>Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
     *
     *<br> Constraints:
     *
     *<br> nums1.length == m + n
     * <br>nums2.length == n
     * <br>0 <= m, n <= 200
     * <br>1 <= m + n <= 200
     * <br>-109 <= nums1[i], nums2[j] <= 109
     *
     * <br>Follow up: Can you come up with an algorithm that runs in O(m + n) time?
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int indexnums = 0;
    int indexnum1 = m -1;
    int indexnum2 = n -1;
      if(nums2[0] >= nums1[indexnum1]) {
          for (int i = m; i < nums1.length; i++) {
              nums1[i] = nums2[indexnums];
              indexnums++;
          }
      }else if(nums1[0] >= nums2[indexnum2]) {
          for (int i = nums1.length -1; i >= 0; i--) {
            if(indexnum1 >= 0) {
                nums1[i] = nums1[indexnum1];
                indexnum1--;
            }else {
                nums1[i] = nums2[indexnum2];
                indexnum2--;
            }

          }
      }else {
          for (int i = m; i < nums1.length; i++) {
              nums1[i] = nums2[indexnums];
              indexnums++;
          }
          for (int i = 0; i < nums1.length - 1; i++) {
              big0++;
              for (int j = i + 1; j < nums1.length; j++) {
                  big0++;
                  if(nums1[i] > nums1[j]) {
                      int temp = nums1[i];
                      nums1[i] = nums1[j];
                      nums1[j] = temp;
                  }
              }
          }
      }
        System.out.println(Arrays.toString(nums1));
    }
}
