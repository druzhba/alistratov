package ru.job4j.professions;
/**
 * Class Profession родительский класс для всех профессий.
 * @author alistratov
 * @since 10.01.2018
 * @version 1
 */

public class Profession {
    /**
     * Имя.
     */
    public String name;
    /**
     * Возраст.
     */
    public int age;
    /**
     * Образование.
     */
    public String education;
    /**
     * Есть ли дети.
     */
    public boolean children;
    /**
     * Возвращает имя.
     * @return имя
     */
    public String getName() {
        return this.name;
    }
    /**
     * Возвращает возраст.
     * @return возвраст
     */
    public int getAge() {
        return this.age;
    }
    /**
     * Возвращает образование.
     * @return образование
     */
    public String getEducation() {
        return this.education;
    }
    /**
     * Возвращает есть ли дети.
     * @return да или нет
     */
    public boolean getChildren() {
        return this.children;
    }
}
