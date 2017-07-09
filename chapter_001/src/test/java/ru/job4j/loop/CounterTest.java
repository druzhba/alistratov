package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Anton Listratov (mailto:ant341@yandex.ru)
 * @version 1
 * @since 08.07.2017
 */
public class CounterTest {
/**
* Test add.
*/
	@Test
	public void whenAddOneToTenThenThrity() {
		Counter c = new Counter();
		int result = c.add(1, 10);
		int expected = 30;
		assertThat(result, is(expected));
	}
}