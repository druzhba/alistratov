package ru.job4j.max;

/**
 * Class Max для поиска большего числа.
 * @author listratov
 * @since 01.07.2017
 * @version 1
 */

public class Max {
/**
 * Возвращает большее число из двух чисел.
 * @param first первый аргумент.
 * @param second второй аргумент.
 * @return Большее число.
 */
	public int max(int first, int second) {
		return first > second ? first : second;
	}
/**
 * Возвращает большее число из трех чисел.
 * @param first первый аргумент.
 * @param second второй аргумент.
 * @param third третий аргумент.
 * @return большее число.
 */
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}