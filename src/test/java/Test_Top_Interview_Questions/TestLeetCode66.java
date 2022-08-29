package Test_Top_Interview_Questions;

import Top_Interview_Questions.LeetCode66;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertTrue;

public class TestLeetCode66 {
	LeetCode66 obj = new LeetCode66();

	@Test
	public void testPlusOne() {
		int[] digits = { 1, 2, 3 };
		int[] expected = { 1, 2, 4 };
		assertTrue(Arrays.equals(expected, obj.plusOne(digits)));
	}

	@Test
	public void testPlusOne_2() {
		int[] digits = { 9, 9, 9 };
		int[] expected = { 1, 0, 0, 0 };
		assertTrue(Arrays.equals(expected, obj.plusOne(digits)));
	}

	@Test
	public void testPlusOne_3() {
		int[] digits = { 9, 8, 9 };
		int[] expected = { 9, 9, 0 };
		assertTrue(Arrays.equals(expected, obj.plusOne(digits)));
	}

	@Test
	public void testPlusOne_4() {
		int[] digits = { 9, 9, 8 };
		int[] expected = { 9, 9, 9 };
		assertTrue(Arrays.equals(expected, obj.plusOne(digits)));
	}

	@Test
	public void testPlusOne_5() {
		int[] digits = { 0 };
		int[] expected = { 1 };
		assertTrue(Arrays.equals(expected, obj.plusOne(digits)));
	}

}
