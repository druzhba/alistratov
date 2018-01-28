package ru.job4j.pseudo;
/**
 * Class Square.
 * @author Anton Listratov
 * @since 28.01.2018
 * @version 1
 */
public class Square implements Shape {
    /**
     * Метод рисует квадрат.
     * @return квадрат в виде строки
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("++++");
        pic.append("+  +");
        pic.append("+  +");
        pic.append("++++");
        return pic.toString();
    }
}
