package ru.job4j.professions;
/**
 * Class People люди.
 * @author alistratov
 * @since 01.10.2018
 * @version 1
 */
public class People {
    /**
     * Имя.
     */
    private String name;
    /**
     * Создание человека.
     * @param name имя человека
     */
    public People(String name) {
        this.name = name;
    }
    /**
     * Возвращает имя человека.
     * @return имя
     */
    public String getPeopleName() {
        return this.name;
    }
}
