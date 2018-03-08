package ru.job4j.tracker;
/**
 * Interface UserAction.
 * @author Anton Listratov
 * @since 05.03.2018
 * @version 1
 */
public interface UserAction {
    /**
     * Метод key.
     * @return ключ
     */
    int key();
    /**
     * Метод execute.
     * @param input вод данных
     * @param tracker хранилище заявок
     */
    void execute(Input input, Tracker tracker);
    /**
     * Метод info.
     * @return информация
     */
    String info();
}
