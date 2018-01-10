package ru.job4j.professions;
/**
 * Class Teacher профессия учитель.
 * @author alistratov
 * @since 10.01.2018
 * @version 1
 */
public class Teacher extends Profession {
    /**
     * Создание учителя.
     * @param name имя
     * @param age возраст
     * @param education образование
     * @param children есть ли дети
     */
    public Teacher(String name, int age, String education, boolean children) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.children = children;
    }
    /**
     * Возвращает строку.
     * @param student студент
     * @return строку
     */
    public String learnStudents(Student student) {
        return "Учитель " + super.getName() + " обучает " + student.getStudentName();
    }
}
