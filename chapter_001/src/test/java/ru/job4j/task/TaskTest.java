package ru.job4j.task;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Anton Listratov (mailto:ant341@yandex.ru)
 * @since 24.12.2017
 * @version 1
 */

public class TaskTest {
    /**
     * Test contain.
     */
    @Test
    public void whenWordContainSubThenReturnTrue() {
        Task t = new Task();
        String origin = "Привет";
        String sub = "ивет";
        boolean result = t.contains(origin, sub);
        boolean expected = true;
        assertThat(result, is(expected));
    }
}
