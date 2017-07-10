package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Anton Listratov (mailto:ant341@yandex.ru)
 * @version 1
 * @since 10.07.2017
 */
 public class FactorialTest {
/**
 * Test calc.
 */
	@Test
	public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
		Factorial f = new Factorial();
		int result = f.calc(5);
		int expected = 120;
		assertThat(result, is(expected));
	}
/**
 * Test calc when zero.
 */
	@Test
	public void whenCalculateFactorialForZeroThenOne() {
		Factorial fZero = new Factorial();
		int result = fZero.calc(0);
		int expected = 1;
		assertThat(result, is(expected));
	}
 }