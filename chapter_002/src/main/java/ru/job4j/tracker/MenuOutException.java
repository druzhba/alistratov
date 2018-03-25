package ru.job4j.tracker;

/**
 * Class MenuOutException.
 * @author Anton Listratov
 * @since 20.03.2018
 * @version 1
 */
public class MenuOutException extends RuntimeException {
    /**
     * Конструктор.
     * @param msg сообщение
     */
    public MenuOutException(String msg) {
        super(msg);
    }
}
