package Test_Top_Interview_Questions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Top_Interview_Questions.LeetCode6;
public class TestLeetCode6 {
	LeetCode6 obj = new LeetCode6();
	
	@Test
	public void testConvert() {
		String s = "PAYPALISHIRING";
		int numRows = 3;
		assertEquals("PAHNAPLSIIGYIR", obj.convert(s, numRows));
	}
	
	@Test
	public void testConvert_2() {
		String s = "PAYPALISHIRING";
		int numRows = 4;
		assertEquals("PINALSIGYAHRPI", obj.convert(s, numRows));
	}
	@Test
	public void testConvert_3() {
		String s = "P";
		int numRows = 1;
		assertEquals("P", obj.convert(s, numRows));
	}
	
	@Test
	public void testConvert_4() {
		String s = "PA";
		int numRows = 1;
		assertEquals("PA", obj.convert(s, numRows));
	}
}
