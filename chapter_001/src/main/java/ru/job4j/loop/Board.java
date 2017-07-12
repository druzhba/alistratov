package ru.job4j.loop;

/**
 * Class Board для построения шахматной доски.
 * @author alistratov
 * @since 11.07.2017
 * @version 1
 */
public class Board {
/**
 * Возвращает шахматную доску.
 * @param width ширина доски.
 * @param height высота доски.
 * @return шахматную доску.
 */
	public String paint(int width, int height) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ((i + j) % 2 == 0) {
					result.append('x');
				} else {
					result.append(" ");
				}
			}
			result.append(System.getProperty("line.separator"));
		}
		return result.toString();
	}
}