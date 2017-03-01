package stencils;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;


public class ArrayInverterTest {

	int[] A;
	int[] expected;
	
    //exemplary test
	@Test
	public void exemplaryTest() {
		A = new int[]{1, 2, 3, 4, 5};
		expected = new int[]{5, 4, 3, 2, 1};
		assertTrue(Arrays.equals(expected, ArrayInverter.of(A)));
	}


}
