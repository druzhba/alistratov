package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Anton Listratov (mailto:ant341@yandex.ru)
 * @since 14.07.2017
 * @version 1
 */
public class BubbleSortTest {
/**
 * Test sort.
 */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
		BubbleSort bubble = new BubbleSort();
		int[] array = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] result = bubble.sort(array);
		int[] expected = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		assertThat(result, is(expected));
    }
}