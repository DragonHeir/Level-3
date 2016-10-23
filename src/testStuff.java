import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class testStuff {

	@Test
	public void test() {
		int array1[] = {5,2,4,1,3};
		int array2[] = {1,2,3,4,5};
		assertArrayEquals(array2, sortArray(array1));
	}

	private int[] sortArray(int[] array1) {
		Arrays.sort(array1);
		return array1;
	}

}
