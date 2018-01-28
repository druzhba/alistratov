package ru.job4j.pseudo;

/**
 * Class Triangle.
 * @author Anton Listratov
 * @since 28.01.2018
 * @version 1
 */
public class Triangle implements Shape {
    /**
     * Метод рисует треугольник.
     * @return треугольник в виде строки
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("   +   ");
        pic.append("  + +");
        pic.append(" +   +");
        pic.append("+++++++");
        return pic.toString();
    }
}
