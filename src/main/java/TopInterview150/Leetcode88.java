package TopInterview150;
/**
 * {@code @Author:} hoangsang03 <br>
 * Title: 88. Merge Sorted Array <br>
 * Level: <b>Easy</b> <br>
 * Link: <a href="https://leetcode.com/problems/merge-sorted-array/">LeetCode88</a>
 */
public class Leetcode88 {

    /**
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
     * <br>
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     * <br>
     * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     * <br>
     * Constraints: <br>
     *
     * nums1.length == m + n <br>
     * nums2.length == n <br>
     * 0 <= m, n <= 200 <br>
     * 1 <= m + n <= 200 <br>
     * -109 <= nums1[i], nums2[j] <= 109 <br>
     *
     * @param nums1 : first integer array
     * @param m : first m valid element of nums1
     * @param nums2 : second integer array
     * @param n : length of nums2
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int fromIndex = 0;
        if(m == 0){
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
        }
        for (int num : nums2) {
            fromIndex = findSuitablePosition(num, nums1, fromIndex, m - 1);
            insertNumIntoPutIndex(nums1, m, num, fromIndex);
            m++;
        }
    }

    public void insertNumIntoPutIndex(int[] nums2, int currentLen, int putValue, int putIndex) {
        for (int i = currentLen; i > putIndex ; i--) {
            nums2[i] = nums2[i-1];
        }
        nums2[putIndex] = putValue;
    }

    public int findSuitablePosition(int num, int[] nums1, int fromIndex, int toIndex) {
        int centerPoint = 0;
        while (fromIndex <= toIndex) {
            centerPoint = (fromIndex+toIndex)/2;
            if(num < nums1[centerPoint]) {
                toIndex = centerPoint - 1;
            } else if (num > nums1[centerPoint]) {
                fromIndex = centerPoint + 1;
            } else {
                return centerPoint;
            }
        }

        if(nums1[centerPoint] < num) {
            return centerPoint + 1;
        } else {
            return centerPoint;
        }
    }
}
