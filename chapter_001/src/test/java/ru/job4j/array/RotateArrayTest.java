package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Anton Listratov (mailto:ant341@yandex.ru)
 * @since 11.10.2017
 * @version 1
*/
public class RotateArrayTest {
/**
 * Test rotate 2x2.
*/
	@Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        //напишите здесь тест, проверяющий поворот массива размером 2 на 2.
		RotateArray r = new RotateArray();
		int[][] array = {{1, 2}, {3, 4}};
		int[][] result = r.rotate(array);
		int[][] expected = {{3, 1}, {4, 2}};
		assertThat(result, is(expected));
    }
/**
 * Test rotate 3x3.
 */
	@Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        //напишите здесь тест, проверяющий поворот массива размером 3 на 3.
		RotateArray rArray = new RotateArray();
		int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] result = rArray.rotate(array);
		int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		assertThat(result, is(expected));
    }
}
