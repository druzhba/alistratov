package ru.job4j.pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class TriangleTest.
 * @author Anton Listratov
 * @since 28.01.2018
 * @version 1
 */
public class TriangleTest {
    /**
     * Test draw for triangle.
     */
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(triangle.draw(), is(new StringBuilder()
                   .append("   +   ")
                   .append("  + +")
                   .append(" +   +")
                   .append("+++++++")
                   .toString()));
    }
}
