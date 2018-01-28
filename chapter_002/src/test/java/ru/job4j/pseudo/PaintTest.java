package ru.job4j.pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * Class PaintTest.
 * @author Anton Listratov
 * @since 28.01.2018
 * @version 1
 */
public class PaintTest {
    /**
     * Test draw square for class Paint.
     */
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(new String(out.toByteArray()), is(
                        new StringBuilder()
                                .append("++++")
                                .append("+  +")
                                .append("+  +")
                                .append("++++")
                                .append(System.lineSeparator())
                                .toString()));
        System.setOut(stdout);
    }
    /**
     * Test draw triangle for class Paint.
     */
    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(new String(out.toByteArray()), is(
                new StringBuilder()
                        .append("   +   ")
                        .append("  + +")
                        .append(" +   +")
                        .append("+++++++")
                        .append(System.lineSeparator())
                        .toString()));
        System.setOut(stdout);
    }
}
