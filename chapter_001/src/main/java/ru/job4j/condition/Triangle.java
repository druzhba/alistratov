package ru.job4j.condition;

/**
 * Class Triangle для расчета площади треугольника по точкам.
 * @author listratov
 * @since 03.07.2017
 * @version 1
 */
public class Triangle {
/**
 * Первая точка.
 */
	private Point a;
/**
 * Вторая точка.
 */
	private Point b;
/**
 * Третья точка.
 */
	private Point c;
/**
 * Создание треугольника.
 * @param a первый аргумент
 * @param b второй аргумент
 * @param c третий аргумент
 */
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
/**
 * Вычесляем площадь треугольника.
 * @return площадь треугольника
 */
	public double area() {
		double result = Math.abs(((this.a.getX() - this.c.getX()) * (this.b.getY() - this.c.getY())) - ((this.b.getX() - this.c.getX()) * (this.a.getY() - this.c.getY())));
		if (result != 0) {
			return result / 2;
		} else {
			return result;
		}
	}
}