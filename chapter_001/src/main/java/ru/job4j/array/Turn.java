package ru.job4j.array;

/**
 * Class Turn для переворота массива.
 * @author alistratov
 * @since 14.07.2017
 * @version 1
 */
public class Turn {
/**
 * Переворачивает массив.
 * @param array массив, который необходимо перевернуть.
 * @return array перевернутый массив.
 */
	public int[] back(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int number = array[array.length - 1 - i];
			array[array.length - 1 - i] = array[i];
			array[i] = number;
		}
		return array;
	}
}