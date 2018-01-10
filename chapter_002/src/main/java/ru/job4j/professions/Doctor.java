package ru.job4j.professions;
/**
 * Class Doctor профессия доктор.
 * @author alistratov
 * @since 10.01.2018
 * @version 1
 */
public class Doctor extends Profession {
    /**
     * Создание доктора.
     * @param name имя
     * @param age возраст
     * @param education образование
     * @param children есть ли дети
     */
    public Doctor(String name, int age, String education, boolean children) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.children = children;
    }
    /**
     * Возвращает строку.
     * @param people человек
     * @return строку
     */
    public String healPeople(People people) {
        return "Доктор " + super.getName() + " лечит " + people.getPeopleName();
    }
}
