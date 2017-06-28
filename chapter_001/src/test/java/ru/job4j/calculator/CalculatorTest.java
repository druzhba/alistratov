package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *
 * @author Anton Listratov (mailto:ant341@yandex.ru)
 * @version 1
 * @since 28.06.2017
 */

public class CalculatorTest {
/**
 * Test add.
 */
	@Test
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc = new Calculator();
		calc.add(1D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}
/**
 * Test subtract.
 */
	@Test
	public void whenSubtractOneMinusOneThenZero() {
		Calculator calc = new Calculator();
		calc.subtract(1D, 1D);
		double result = calc.getResult();
		double expected = 0D;
		assertThat(result, is(expected));
	}
/**
 * Test div.
 */
	@Test
	public void whenDivFourDivideTwoThenTwo() {
		Calculator calc = new Calculator();
		calc.div(4D, 2D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}
/**
 * Test multiple.
 */
	@Test
	public void whenMultipleTwoMultiplyTwoThenFour() {
		Calculator calc = new Calculator();
		calc.multiple(2D, 2D);
		double result = calc.getResult();
		double expected = 4D;
		assertThat(result, is(expected));
	}
}
