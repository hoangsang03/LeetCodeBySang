package Top_Interview_Questions;

/*
 * Difficulty: Hard
 * 4. Median of Two Sorted Arrays
 * Link : https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class LeetCode4 {

    /*
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
     * the median of the two sorted arrays.
     *
     * The overall run time complexity should be O(log (m+n)). nums1.length == m ;
     * nums2.length == n 0 <= m <= 1000 ; 0 <= n <= 1000 1 <= m + n <= 2000
     * #CAREFULLY! -10e6 <= nums1[i], nums2[i] <= 10e6
     *
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Part 1 : Find index of median which has been saved in rest variable
        int length1 = nums1.length;
        int length2 = nums2.length;
        int rest = (length2 + length1 + 1) / 2;
        int nums1Stop = -1;
        int nums2Stop = -1;
        int get;
        double median;
        int comparisonIndex1;
        int comparisonIndex2;

        // check nums1 or nums2 is empty ?
        // and need to return, because it's easier for catch "Out of index" if continue
        if (length1 == 0) {
            return length2 % 2 == 0 ? (nums2[rest - 1] + nums2[rest]) / 2.0 : nums2[rest - 1];
        } else if (length2 == 0) {
            return length1 % 2 == 0 ? (nums1[rest - 1] + nums1[rest]) / 2.0 : nums1[rest - 1];
        }

        // when rest = 1 -> get = 1 / 2 = 0 --> Wrong . So rest++;
        rest++;
        do {
            // the case there is only one array that we can get elements
            if (nums1Stop == length1 - 1) {
                rest--;
                // get rest elements in nums2
                nums2Stop += rest;
                break;
            } else if (nums2Stop == length2 - 1) {
                rest--;
                // get rest elements in nums1
                nums1Stop += rest;
                break;
            }

            // the case we can get elements in all two arrays
            get = rest / 2;
            // find index of element which need to compare
            comparisonIndex1 = (nums1Stop + get) >= length1 ? length1 - 1 : (nums1Stop + get);
            comparisonIndex2 = (nums2Stop + get) >= length2 ? length2 - 1 : (nums2Stop + get);

            // we can get in both arrays
            if (nums1[comparisonIndex1] > nums2[comparisonIndex2]) {
                get = comparisonIndex2 - nums2Stop;
                nums2Stop = comparisonIndex2;
            } else if (nums1[comparisonIndex1] < nums2[comparisonIndex2]) {
                get = comparisonIndex1 - nums1Stop;
                nums1Stop = comparisonIndex1;
            } else {
                get = comparisonIndex1 - nums1Stop + comparisonIndex2 - nums2Stop;
                nums1Stop = comparisonIndex1;
                nums2Stop = comparisonIndex2;
            }
            rest -= get;

        } while (rest > 1);

        // in the case iMedian = 0 ---> median is always
        // equal nums1[nums1Stop] = nums2[nums2Stop]
        if (rest == 0) {
            return nums1[nums1Stop];
        }

        // get Median
        // check that the where is last element ?
        if (nums1Stop == -1) {
            median = nums2[nums2Stop];
        } else if (nums2Stop == -1) {
            median = nums1[nums1Stop];
        } else {
            median = nums1[nums1Stop] > nums2[nums2Stop] ? nums1[nums1Stop] : nums2[nums2Stop];
        }

        // check (m+n) is even then get more to calculate median
        if ((length2 + length1) % 2 == 0) {
            // get one more median which is in one of two arrays
            // check Does any array get more?
            if (nums1Stop == length1 - 1) {
                // only get in nums2 array
                median += nums2[nums2Stop + 1];
                median /= 2;
            } else if (nums2Stop == length2 - 1) {
                // only get in nums1 array
                median += nums1[nums1Stop + 1];
                median /= 2;
            } else {
                // now the 2nd median can be in one of two arrays
                median += nums1[nums1Stop + 1] < nums2[nums2Stop + 1] ? nums1[nums1Stop + 1] : nums2[nums2Stop + 1];
                median /= 2;
            }

        } else { // (m+n) is odd
            return median;
        }
        return median;
    }
}
