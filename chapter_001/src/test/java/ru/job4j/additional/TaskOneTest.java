package ru.job4j.additional;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;


/**
 * Test.
 *
 * @author Anton Listratov (mailto:ant341@ya.ru)
 * @since 05.01.2018
 * @version 1
 */

public class TaskOneTest {
    /**
     * Test.
     */
    @Test
    public void whenAddArraysThenReturnTrue() {
        TaskOne t = new TaskOne();
        int[] array = {1, 2, 3, 4, 5};
        boolean result = t.isSorted(array);
        boolean expected = true;
        Assert.assertThat(result, Is.is(expected));
    }
}
