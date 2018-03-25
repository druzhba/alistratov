package ru.job4j.tracker;

/**
 * Interface Input.
 * @author Anton Listratov
 * @since 21.01.2018
 * @version 1
 */

public interface Input {
    /**
     * Метод ask.
     * @param question вопрос
     * @return ответ
     */
    String ask(String question);
    /**
     * Метод ask.
     * @param question вопрос
     * @param range промежуток
     * @return ответ
     */
    int ask(String question, int[] range);
}
