package ru.job4j.pseudo;

/**
 * Class Paint.
 * @author Anton Listratov
 * @since 28.01.2018
 * @version 1
 */
public class Paint {
    /**
     * Метод рисует фигуру.
     * @param shape фигура
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
    /**
     * Метод main.
     * @param args аргументы
     */
    public static void main(String[] args) {
        Paint square = new Paint();
        square.draw(new Square());
        Paint triangle = new Paint();
        triangle.draw(new Triangle());
    }
}
