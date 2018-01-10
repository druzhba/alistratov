package ru.job4j.professions;
/**
 * Class Student студенты.
 * @author alistratov
 * @since 10.01.2018
 * @version 1
 */
public class Student {
    /**
     * Имя.
     */
    private String name;
    /**
     * Создание студента.
     * @param name имя студента
     */
    public Student(String name) {
        this.name = name;
    }
    /**
     * Возвращает имя студент.
     * @return имя
     */
    public String getStudentName() {
        return name;
    }
}
