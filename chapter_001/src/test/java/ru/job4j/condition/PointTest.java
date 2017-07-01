package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Anton Listratov (mailto:ant341@yandex.ru)
 * @version 1
 * @since 01.07.2017
 */
 public class PointTest {
/**
 * Test point.
 */
	@Test
	public void whenAddOneAndOneEqualsTwoAndThreeThenFalse() {
		Point p = new Point(1, 1);
		boolean result = p.is(2, 3);
		boolean expected = false;
		assertThat(result, is(expected));
	}
 }