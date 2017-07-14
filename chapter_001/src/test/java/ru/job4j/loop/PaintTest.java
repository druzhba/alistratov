package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Anton Listratov (mailto:ant341@yandex.ru)
 * @version 1
 * @since 12.07.2017
 */
 public class PaintTest {
/**
 * Test piramid 2.
 */
	@Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
		final String line = System.getProperty("line.separator");
        String expected = String.format(" ^ %s^^^%<s", line);
        assertThat(result, is(expected));
    }
/**
 * Test piramid 3.
 */
	@Test
	public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
		Paint p = new Paint();
        String result = p.piramid(3);
		final String line = System.getProperty("line.separator");
        String expected = String.format("  ^  %s ^^^ %<s^^^^^%<s", line);
        assertThat(result, is(expected));
	}
 }