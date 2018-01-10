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
public class EngineerTest {
    /**
     * Test invent.
     */
    @Test
    public void whenAddNameReturnSentence() {
        Engineer engineer = new Engineer("Bill", 42, "MAI", true);
        Invetion invetion = new Invetion("Ball");
        String expected = engineer.invent(invetion);
        String result = "Инженер Bill изобретает Ball";
        assertThat(result, is(expected));
    }
}