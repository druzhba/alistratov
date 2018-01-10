package ru.job4j.professions;
/**
 * Class Engineer профессия инженер.
 * @author alistratov
 * @since 10.01.2018
 * @version 1
 */

public class Engineer extends Profession {
    /**
     * Создание инженера.
     * @param name имя
     * @param age возраст
     * @param education образование
     * @param children есть ли дети
     */
    public Engineer(String name, int age, String education, boolean children) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.children = children;
    }
    /**
     * Возвращает строку.
     * @param invetion изобретение
     * @return строку
     */
    public String invent(Invetion invetion) {
        return "Инженер " + super.getName() + " изобретает " + invetion.getInventionName();
    }
}
