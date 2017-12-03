package ru.job4j.array;

import java.util.Arrays;

/**
 *Class ArrayDuplicate для удаления дубликатов в массиве.
 * @author Anton Listratov
 * @since 03.12.2017
 * @version 1
*/
public class ArrayDuplicate {
	/**
	 * Удаляет дубликаты в массиве.
	 *
	 * @param array массив из которого удаляются дубликаты.
	 * @return  массив без дубликатов
	 */
	public String[] remove(String[] array) {
		int size = array.length;
		for (int i = 0; i < size; i++) {
			String word = array[i];
			for (int j = i + 1; j < size; j++) {
				if (word.equals(array[j])) {
					array[j] = array[size - 1];
					size--;
					j--;
				}
			}
		}
		return Arrays.copyOf(array, size);
	}
}
