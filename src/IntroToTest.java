import static org.junit.Assert.*;

import org.junit.Test;

public class IntroToTest {

	@Test
	public void test() {
		assertEquals(8, add(5,3));
	}	
	
	int add(int x, int y){
		return x+y;
	}
	
}
