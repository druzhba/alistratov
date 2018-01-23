package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Class ConsoleInput.
 * @author Anton Listratov
 * @since 21.01.2018
 * @version 1
 */

public class ConsoleInput implements Input {
    /**
     * Объект Scanner.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Метод выводит вопрос и получает ответ.
     * @param question вопрос
     * @return ответ
     */
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

}
