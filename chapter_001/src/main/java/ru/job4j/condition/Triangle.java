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
		double ab = Math.sqrt(Math.pow(this.b.getX() - this.a.getX(), 2) + Math.pow(this.b.getY() - this.a.getY(), 2));
		double ca = Math.sqrt(Math.pow(this.c.getX() - this.a.getX(), 2) + Math.pow(this.c.getY() - this.a.getY(), 2));
		double bc = Math.sqrt(Math.pow(this.c.getX() - this.b.getX(), 2) + Math.pow(this.c.getY() - this.b.getY(), 2));
		if ((ab + bc <= ca) || (ab + ca <= bc) || (ca + bc <= ab)) {
			return 0;
		} else {
		double result = Math.abs(((this.a.getX() - this.c.getX()) * (this.b.getY() - this.c.getY())) - ((this.b.getX() - this.c.getX()) * (this.a.getY() - this.c.getY())));
		if ((result == 0)) {
			return result;
		} else {
			return result / 2;
		}
		}
	}
}