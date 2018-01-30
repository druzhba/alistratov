package ru.job4j.pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.After;
/**
 * Class PaintTest.
 * @author Anton Listratov
 * @since 28.01.2018
 * @version 1
 */
public class PaintTest {
    /**
     * Дефолтный вывод на консоль.
     */
    private final PrintStream stdout = System.out;
    /**
     * Буфер для результата.
     */
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Метод устанавливает вывод в память.
     */
    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }
    /**
     * Метод устанавливает стандартный вывод.
     */
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }
    /**
     * Test draw square for class Paint.
     */
    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(new String(out.toByteArray()), is(
                        new StringBuilder()
                                .append("++++")
                                .append("+  +")
                                .append("+  +")
                                .append("++++")
                                .append(System.lineSeparator())
                                .toString()));
    }
    /**
     * Test draw triangle for class Paint.
     */
    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(new String(out.toByteArray()), is(
                new StringBuilder()
                        .append("   +   ")
                        .append("  + +")
                        .append(" +   +")
                        .append("+++++++")
                        .append(System.lineSeparator())
                        .toString()));
    }
}
