package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Anton Listratov (mailto:ant341@yandex.ru)
 * @version 1;
 * @since 01.07.2017
 */
 public class MaxTest {
/**
 * Test max.
 */
	@Test
	public void whenAddOneEqualsTwoThenTwo() {
		Max m = new Max();
		int result = m.max(1, 2);
		int expected = 2;
		assertThat(result, is(expected));
	}
 }