package ru.job4j.array;

/**
 * Class RotateArray для поворота квадратного массива.
 * @author alistratov
 * @since 11.10.2017
 * @version 1
*/
public class RotateArray {
/**
 *	Поворачивает квадратный массив.
 * @param array массив,который будет повернут.
 * @return array повернутый массив.
*/
	public int[][] rotate(int[][] array) {
		int m = array.length;
		for (int i = 0; i < m / 2; i++) {
			for (int j = i; j < m - 1 - i; j++) {
				int n = array[i][j];
				array[i][j] = array[m - 1 - j][i];
				array[m - 1 - j][i] = array[m - 1 - i][m - 1 - j];
				array[m - 1 - i][m - 1 - j] = array[j][m - 1 - i];
				array[j][m - 1 - i] = n;
			}
		}
		return array;
	}
}