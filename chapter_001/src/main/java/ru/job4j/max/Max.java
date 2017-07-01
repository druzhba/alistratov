package ru.job4j.max;

/**
 * Class Max для поиска большего числа.
 * @author listratov
 * @since 01.07.2017
 * @version 1
 */

public class Max {
/**
 * Возвращает большее число.
 * @param first первый аргумент.
 * @param second второй аргумент.
 * @return Большее число.
 */
	public int max(int first, int second) {
		return first > second ? first : second;
	}
}