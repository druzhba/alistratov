package ru.job4j.condition;

/**
 * Class Point находит расстояние между точками в системе координат.
 * @author alistratov
 * @since 03.12.2017
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
    /**
     * Находим расстояние между точками.
     * @param that аргумент
     * @return результат
     */
    public double distanceTo(Point that) {
        // Точка А - это текущая точка. К ней мы обращаемся через оператор this.
        Point a = this;
        // Точка B - это входящая точка. К ней мы можем обратиться напрямую через имя переменной that.
        // или для удобства мы создали новую переменную b  и к ней присвоили переменную this.
        Point b = that;

        int x1 = a.x;
        int y1 = a.y;
        int x2 = b.x;
        int y2 = b.y;
        double result = Math.sqrt(
                Math.pow(x2 - x2, 2) + Math.pow(y2 - y1, 2)
        );
        return result;
    }
    /**
     * @param args аргументы
     */
    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        // сделаем вызов метода
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками A и B : " + result);
    }
}
