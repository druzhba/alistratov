package ru.job4j.professions;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Anton Listratov (mailto:ant341@yandex.ru)
 * @since 10.01.2018
 * @version 1
 */
public class TeacherTest {
    /**
     * Test larnStudents.
     */
    @Test
    public void whenAddNameReturnSentence() {
        Teacher teacher = new Teacher("Scot", 27, "MGU", false);
        Student student = new Student("Larry");
        String expected = teacher.learnStudents(student);
        String result = "Учитель Scot обучает Larry";
        assertThat(result, is(expected));
    }
}
