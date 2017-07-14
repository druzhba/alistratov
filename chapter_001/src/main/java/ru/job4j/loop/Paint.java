package ru.job4j.loop;

/**
 * Class Paint для построения пирамиды.
 * @author alistratov
 * @since 13.07.2017
 * @version 1
 */
public class Paint {
/**
 * Возвращает пирамиду.
 * @param h высота пирамиды.
 * @return пирамиду.
 */
	public String piramid(int h) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < 2 * h - 1; j++) {
				if ((i + j >= h - 1) && (i + j < h + 2 * i)) {
					result.append('^');
				} else {
					result.append(" ");
				}
			}
			result.append(System.getProperty("line.separator"));
		}
		return result.toString();
	}
}