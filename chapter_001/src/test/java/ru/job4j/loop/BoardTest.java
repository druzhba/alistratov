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
 public class BoardTest {
/**
 * Test paint 3x3.
 */
	@Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("x x%s x %sx x%s", line, line, line);
        assertThat(result, is(expected));
    }
/**
 * Test paint 5x4.
 */
	@Test
	public void whenPaintBoardWidthFiveAndHeightFourThenStringWidthFiveColsAndFourRows() {
		Board b = new Board();
		String result = b.paint(5, 4);
		final String line = System.getProperty("line.separator");
		String expected = String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line);
		assertThat(result, is(expected));
	}
 }