package ru.job4j.loop;
/**
 * Class Counter для подсчета суммы чисел.
 * @author alistratov
 * @since 08.07.2017
 * @version 1
 */
public class Counter {
/**
 * Возвращает сумму четных чисел.
 * @param start первый аргумент.
 * @param finish второй аргумент.
 * @return сумма.
 */
	public int add(int start, int finish) {
		int result = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				result += i;
			}
		}
		return result;
	}
}