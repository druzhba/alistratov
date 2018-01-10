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
public class DoctorTest {
    /**
     * Test healPeople.
     */
    @Test
    public void whenAddNameReturnSentence() {
        Doctor doctor = new Doctor("Alex", 35, "MIU", true);
        People people = new People("Mary");
        String expected = doctor.healPeople(people);
        String result = "Доктор Alex лечит Mary";
        assertThat(result, is(expected));
    }
}
