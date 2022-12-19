package org.emrb;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Eduardo Mauricio Ramírez Blauvelt
 * @version 1.0
 */

public class Sorting {

	/**
	 * Sorts a given array of numbers.
	 */

	public void sorter(String[] array) {
		if (array == null) {
			throw new IllegalArgumentException("null array");
		}

		if (array.length == 0 || array.length == 1) {
			return;
		}

		if (array.length > 10) {
			throw new IllegalArgumentException("Can't take more than 10 elements");
		}

		List<String> sorted = Stream.of(array)
			.map(Long::parseLong)
			.sorted()
			.map(String::valueOf)
			.collect(Collectors.toList())
		;

		for(int i = 0; i < array.length; i++) {
			array[i] = sorted.get(i);
		}

		/*
		long[] data = new long[array.length];
		for (int i = 0; i < array.length; i++) {
			data[i] = Long.parseLong(array[i]);
		}

		Arrays.sort(data);

		for (int i = 0; i < array.length; i++) {
			array[i] = Long.toString(data[i]);
		}
		*/
	}

}
