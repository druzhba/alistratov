package ru.job4j.professions;
/**
 * Class Invention изобретение.
 * @author alistratov
 * @since 10.01.2018
 * @version 1
 */
public class Invetion {
    /**
     * Имя.
     */
    private String name;
    /**
     * Создание изобретения.
     * @param name имя изобретения
     */
    public Invetion(String name) {
        this.name = name;
    }
    /**
     * Возвращает название изобретения.
     * @return изобретение
     */
    public String getInventionName() {
        return this.name;
    }
}
