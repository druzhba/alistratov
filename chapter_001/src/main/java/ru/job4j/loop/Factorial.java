package ru.job4j.loop;
/**
 * Class Factorial для вычесления факториала.
 * @author alistratov
 * @since 10.07.2017
 * @version 1
 */
 public class Factorial {
/**
 * Возвращает факториал числа.
 * @param n аргумент.
 * @return факториал.
 */
	 public int calc(int n) {
		 int result = 1;
		 if (n == 0) {
			return result;
		 } else {
		 for (int i = 1; i <= n; i++) {
			 result *= i;
		 }
		 return result;
		 }
	 }
 }