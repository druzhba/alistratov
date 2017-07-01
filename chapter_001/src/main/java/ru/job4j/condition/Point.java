package ru.job4j.condition;

/**
 * Class condition описывает точку в системе координат.
 * @author listratov
 * @since 01.07.2017
 * @version 1
 */
 public class Point {
/**
 * Значение х.
 */
	 private int x;
/**
 * Значение y.
 */
	 private int y;
/**
 * Создание точки.
 * @param x первый аргумент
 * @param y второй аргумент
 */
	 public Point(int x, int y) {
		 this.x = x;
		 this.y = y;
	 }
/**
 * Получени точки х.
 * @return значени х
 */
	 public int getX() {
		 return this.x;
	 }
/**
 * Получени точки y.
 * @return значени y
 */
	 public int getY() {
		 return this.y;
	 }
/** Проверяет находится ли точка на функции.
 * @param a первый аргумент
 * @param b второй аргумент
 * @return правда или ложь
 */
	 public boolean is(int a, int b) {
		 return this.y == a * this.x + b ? true : false;
	 }
 }