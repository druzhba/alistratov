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

public class TaskTwoTest {
    /**
     * Test.
     */
    @Test
    public void whenaddTwoArraysThenSortedArray() {
        TaskTwo t = new TaskTwo();
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8};
        int[] result = t.sort(array1, array2);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        Assert.assertThat(result, Is.is(expected));
    }
}
