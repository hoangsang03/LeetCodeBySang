package TestLeetCode88_NTN_TopInterView150;

import LeetCode88_NTN_TopInterview150.LeetCode88;
import org.junit.jupiter.api.Test;

public class TestLeetCode88 {
    LeetCode88 obj = new LeetCode88();
    @Test
    public void testMerge(){
        int n1 = 3;
        int n2 = 2;
        int[] nums1 = {1,2,3,0,0};
        int[] nums2 = {4,5};
        obj.merge(nums1,n1,nums2,n2);
    }
    @Test
    public void testMerge0(){
        int n1 = 3;
        int n2 = 2;
        int[] nums1 = {4,5,6,0,0};
        int[] nums2 = {2,3};
        obj.merge(nums1,n1,nums2,n2);
    }
    @Test
    public void testMerge1(){
        int n1 = 3;
        int n2 = 2;
        int[] nums1 = {1,2,5,0,0};
        int[] nums2 = {3,6};
        obj.merge(nums1,n1,nums2,n2);
    }
}
