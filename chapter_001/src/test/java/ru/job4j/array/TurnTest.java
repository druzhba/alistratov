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
 public class TurnTest {
/**
 * Test array {2, 6, 1, 4}.
 */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		Turn turn = new Turn();
		int[] array = {2, 6, 1, 4};
		int[] result = turn.back(array);
		int[] expected = {4, 1, 6, 2};
		assertThat(result, is(expected));
    }
/**
 * Test array {1, 2, 3, 4, 5}.
 */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		Turn t = new Turn();
		int[] array = {1, 2, 3, 4, 5};
		int[] result = t.back(array);
		int[] expected = {5, 4, 3, 2, 1};
		assertThat(result, is(expected));
    }
}