package Test_Top_Interview_Questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Top_Interview_Questions.LeetCode7;

/*
 * Given a signed 32-bit integer x, return x with its digits reversed. If
 * reversing x causes the value to go outside the signed 32-bit integer range
 * [-2^31, 2^31 - 1], then return 0.
 * 
 * Assume the environment does not allow you to store 64-bit integers (signed or
 * unsigned).
 */
public class TestLeetCode7 {
	LeetCode7 obj = new LeetCode7();

	/*
	 * in [-2^31, 2^31 - 1]
	 */
	@Test
	public void testReverse_1() {
		int num = 2543;
		assertEquals(3452, obj.reverse(num));
	}

	/*
	 * out high of [-2^31, 2^31 - 1]
	 */
	@Test
	public void testReverse_2() {
		int num = Integer.MAX_VALUE;
		assertEquals(0, obj.reverse(num));
	}

	/*
	 * out low of [-2^31, 2^31 - 1]
	 */
	@Test
	public void testReverse_3() {
		int num = Integer.MIN_VALUE;
		assertEquals(0, obj.reverse(num));
	}

	/*
	 * value = 0
	 */
	@Test
	public void testReverse_4() {
		int num = 0;
		assertEquals(0, obj.reverse(num));
	}

	/*
	 * Integer.MAX_VALUE = 2147483647; value = 2147483642
	 */
	@Test
	public void testReverse_5() {
		int num = 2147483412;
		assertEquals(2143847412, obj.reverse(num));
	}

}
