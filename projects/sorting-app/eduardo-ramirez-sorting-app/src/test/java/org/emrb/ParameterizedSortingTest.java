package org.emrb;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

/**
 * Parameterized testing
 *
 */
@RunWith(Parameterized.class)
public class ParameterizedSortingTest {
	protected Sorting sorting = new Sorting();
	private String[] a;
	private String[] expected;

	public ParameterizedSortingTest(String[] a, String[] expected) {
		this.a = a;
		this.expected = expected;
	}

	@Parameters
	public static String[][][] data() {
		return new String[][][]{
				{{"10", "0", "15", "1", "4", "2", "-13"}, {"-13", "0", "1", "2", "4", "10", "15"}},
				{{"10", "3", "15", "1", "4", "7", "13"}, {"1", "3", "4", "7", "10", "13", "15"}},
				{{"10", "3", "15", "6", "4", "2", "13"}, {"2", "3", "4", "6", "10", "13", "15"}},
		};
	}

	@Test
	public void parameterizedSortTest() {
		sorting.sorter(a);
		assertArrayEquals(expected, a);
	}
}
