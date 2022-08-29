package Test_Top_Interview_Questions;

import Top_Interview_Questions.LeetCode34;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestLeetCode34 {
	private LeetCode34 obj = new LeetCode34();
	
	@Test
	public void searchRange( ) {
		int[] nums1 = { 5, 7, 7, 8, 8, 10 };
		int target1 = 8;
		assertArrayEquals(new int[] {3, 4} , obj.searchRange(nums1, target1));
		
		int[] nums2 = { 5, 7, 7, 8, 8, 10 };
		int target2 = 6;
		assertArrayEquals(new int[] {-1, -1} , obj.searchRange(nums2, target2));
		
		int[] nums3 = new int[0];
		int target3 = 0;
		assertArrayEquals(new int[] {-1, -1} , obj.searchRange(nums3, target3));
		
		int[] nums4 = {1};
		int target4 = 1;
		assertArrayEquals(new int[] {0, 0} , obj.searchRange(nums4, target4));
		
		int[] nums5 = { 5, 7, 7, 8, 8, 10 };
		int target5 = 5;
		assertArrayEquals(new int[] {0, 0} , obj.searchRange(nums5, target5));
		
		int[] nums6 = { 5, 7, 7, 8, 8, 10 };
		int target6 = 10;
		assertArrayEquals(new int[] {5, 5} , obj.searchRange(nums6, target6));
		
		int[] nums7 = { 5, 6, 7, 8, 8, 10 };
		int target7 = 7;
		assertArrayEquals(new int[] {2, 2} , obj.searchRange(nums7, target7));
		
		int[] nums8 = { 5, 7, 7, 8, 8, 10 };
		int target8 = 7;
		assertArrayEquals(new int[] {1, 2} , obj.searchRange(nums8, target8));
		
		int[] nums9 = { 7, 7, 7, 8, 8, 10 };
		int target9 = 7;
		assertArrayEquals(new int[] {0, 2} , obj.searchRange(nums9, target9));
		
		int[] nums10 = { 2,2 };
		int target10 = 2;
		assertArrayEquals(new int[] {0, 1} , obj.searchRange(nums10, target10));
		
		int[] nums11 = { 2,2,2 };
		int target11 = 2;
		assertArrayEquals(new int[] {0, 2} , obj.searchRange(nums11, target11));
	}
	
}
