package ru.job4j.pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class SquareTest.
 * @author Anton Listratov
 * @since 28.01.2018
 * @version 1
 */
public class SquareTest {
    /**
     * Test draw for Square.
     */
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(square.draw(), is(new StringBuilder()
                .append("++++")
                .append("+  +")
                .append("+  +")
                .append("++++")
                .toString()));
    }
}
