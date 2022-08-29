package Test_Top_Interview_Questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Top_Interview_Questions.LeetCode4;

public class TestLeetCode4 {
    private final LeetCode4 obj = new LeetCode4();

    @Test
    public void testFindMedianSortedArrays_1() {
        int[] nums1 = {1, 3, 7};
        int[] nums2 = {};
        assertEquals(3, obj.findMedianSortedArrays(nums1, nums2));
        assertEquals(3, obj.findMedianSortedArrays(nums2, nums1));
    }

    @Test
    public void testFindMedianSortedArrays_2() {
        int[] nums11 = {1, 2};
        int[] nums21 = {3, 4};
        assertEquals(2.5, obj.findMedianSortedArrays(nums11, nums21));
        assertEquals(2.5, obj.findMedianSortedArrays(nums21, nums11));
    }

    @Test
    public void testFindMedianSortedArrays_3() {
        int[] nums11 = {1, 3};
        int[] nums21 = {2};
        assertEquals(2, obj.findMedianSortedArrays(nums11, nums21));
        assertEquals(2, obj.findMedianSortedArrays(nums21, nums11));
    }

    @Test
    public void testFindMedianSortedArrays_5() {
        int[] nums12 = {1, 3};
        int[] nums22 = {3, 4};
        assertEquals(3, obj.findMedianSortedArrays(nums12, nums22));
        assertEquals(3, obj.findMedianSortedArrays(nums22, nums12));
    }

    @Test
    public void testFindMedianSortedArrays_6() {
        int[] nums1 = {};
        int[] nums2 = {1, 3, 7};
        assertEquals(3, obj.findMedianSortedArrays(nums1, nums2));
        assertEquals(3, obj.findMedianSortedArrays(nums2, nums1));
    }

    @Test
    public void testFindMedianSortedArrays_7() {
        int[] nums1 = {1, 3, 5, 6, 7, 8};
        int[] nums2 = {2};
        assertEquals(5, obj.findMedianSortedArrays(nums1, nums2));
        assertEquals(5, obj.findMedianSortedArrays(nums2, nums1));
    }

    @Test
    public void testFindMedianSortedArrays_8() {
        int[] nums16 = {-9, 1, 3};
        int[] nums26 = {2};
        assertEquals(1.5, obj.findMedianSortedArrays(nums16, nums26));
        assertEquals(1.5, obj.findMedianSortedArrays(nums26, nums16));
    }

    @Test
    public void testFindMedianSortedArrays_9() {
        int[] nums1 = {};
        int[] nums2 = {2, 3};
        assertEquals(2.5, obj.findMedianSortedArrays(nums1, nums2));
        assertEquals(2.5, obj.findMedianSortedArrays(nums2, nums1));
    }

    @Test
    public void testFindMedianSortedArrays_10() {
        int[] nums1 = {1, 3, 5, 6, 7, 8};
        int[] nums2 = {1, 2};
        assertEquals(4, obj.findMedianSortedArrays(nums1, nums2));
        assertEquals(4, obj.findMedianSortedArrays(nums2, nums1));
    }

    @Test
    public void testFindMedianSortedArrays_11() {
        int[] nums1 = {1, 3, 5, 5, 7, 8};
        int[] nums2 = {1, 2, 5, 7, 9, 11};
        assertEquals(5, obj.findMedianSortedArrays(nums1, nums2));
        assertEquals(5, obj.findMedianSortedArrays(nums2, nums1));
    }

    @Test
    public void testFindMedianSortedArrays_12() {
        int[] nums1 = {1, 3, 5, 5, 7, 8, 9, 11};
        int[] nums2 = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1};
        assertEquals(-1.5, obj.findMedianSortedArrays(nums1, nums2));
        assertEquals(-1.5, obj.findMedianSortedArrays(nums2, nums1));
    }

    @Test
    public void testFindMedianSortedArrays_13() {
        int[] nums1 = {1, 3, 5, 5, 7, 8, 9, 11};
        int[] nums2 = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0};
        assertEquals(-1, obj.findMedianSortedArrays(nums1, nums2));
        assertEquals(-1, obj.findMedianSortedArrays(nums2, nums1));
    }

    @Test
    public void testFindMedianSortedArrays_14() {
        int[] nums1 = {1};
        int[] nums2 = {2, 3, 4};
        assertEquals(2.5, obj.findMedianSortedArrays(nums1, nums2));
        assertEquals(2.5, obj.findMedianSortedArrays(nums2, nums1));
    }

    @Test
    public void testFindMedianSortedArrays_15() {
        int[] nums1 = {4};
        int[] nums2 = {1, 2, 3};
        assertEquals(2.5, obj.findMedianSortedArrays(nums1, nums2));
        assertEquals(2.5, obj.findMedianSortedArrays(nums2, nums1));
    }

    @Test
    public void testFindMedianSortedArrays_16() {
        int[] nums1 = {3};
        int[] nums2 = {1, 2, 4, 5};
        assertEquals(3, obj.findMedianSortedArrays(nums1, nums2));
        assertEquals(3, obj.findMedianSortedArrays(nums2, nums1));
    }

    @Test
    public void testFindMedianSortedArrays_17() {
        int[] nums1 = {4};
        int[] nums2 = {1, 2, 3, 5};
        assertEquals(3, obj.findMedianSortedArrays(nums1, nums2));
        assertEquals(3, obj.findMedianSortedArrays(nums2, nums1));
    }
}
