package junk;

import static org.junit.Assert.*;

import org.junit.Test;

public class PracticeTest {

	@Test
	public void testGetFirstThreeChars(){
		assertEquals("can", getFirstThreeChars("cantalope"));
		assertEquals("app", getFirstThreeChars("application"));
		assertEquals("Sev", getFirstThreeChars("Seven"));
	}
	@Test
	public void testAddUnlessSame(){
		assertEquals(7, addUnlessSame(3,4));
		assertEquals(0, addUnlessSame(10,10));
		assertEquals(25, addUnlessSame(5,20));
		assertEquals(0, addUnlessSame(1,1));
	}
	@Test
	public void testReduceArrayByHalf(){
		double[] a1 = {10.0, 5.0, 24.0};
		double[] a2 = {5.0, 2.5, 12.0};
		
		assertArrayEquals(a2, reduceArrayByHalf(a1), 0.0001);
	}

	private double[] reduceArrayByHalf(double[] a1) {
		
		return null;
	}
	private Object addUnlessSame(int i, int j) {
		
		return null;
	}
	private Object getFirstThreeChars(String string) {
		
		return null;
	}

}
