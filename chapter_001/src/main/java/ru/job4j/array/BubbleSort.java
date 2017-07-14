package ru.job4j.array;

/**
 * Class BubbleSort для сортировки массива методом перестановки.
 * @author alistratov
 * @since 14.07.2017
 * @version 1
 */
public class BubbleSort {
/**
 * Сортирует массив методом перестановки.
 * @param array массив, который будет отсортировован.
 * @return array отсортировованный массив.
 */
	public int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j - 1] > array[j]) {
					int number = array[j - 1];
					array[j - 1] = array[j];
					array[j] = number;
				}
			}
		}
		return array;
	}
}