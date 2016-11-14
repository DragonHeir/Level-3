import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestPractice {

	@Test
	public void testStrings() {
		String s1 = "ladder";
		String s2 = "computer";
		String s3 = "mississippi";
		
		assertTrue(hasRepeatingChar(s1));
		assertFalse(hasRepeatingChar(s2));
		assertTrue(hasRepeatingChar(s3));
	}
	@Test
	public void testArrays() {
		int[] a1 = {10, 20, 50, 100};
		int[] a2 = {5, 10, 25, 50};
		
		assertArrayEquals(a2, reduceArrayByHalf(a1));
	}
	boolean hasRepeatingChar(String x) {
		ArrayList <Character> CharList = new ArrayList<Character>();
		for (int i = 0; i < x.length(); i++) {
			if (CharList.contains(x.charAt(i))) {
				return true;
			}
			else {
				CharList.add(x.charAt(i));
			}
		}
		return false;
		
	}
	int[] reduceArrayByHalf(int[] a1) {
		for (int i = 0; i < a1.length; i++) {			
			
		}
		return a2;
	}
	
}
