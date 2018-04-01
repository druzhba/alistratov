package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Class ValidateInputTest.
 *
 * @author Anton Listratov (mailto: ant341@ya.ru)
 * @since 26.03.2018
 * @version 1
 */

public class ValidateInputTest {
    /**
     * Буфер для результата.
     */
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    /**
     * Дефолтный вывод на консоль.
     */
    private final PrintStream out = System.out;
    /**
     * Метод устанавливает вывод в память.
     */
    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }
    /**
     * Метод устанавливает стандартный вывод.
     */
    @After
    public void loadSys() {
        System.setOut(this.out);
    }
    /**
     *Test.
     */
    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(new StubInput(new String[] {
               "invalid", "1"
        }));
        input.ask("select:", new int[] {1});
        assertThat(this.mem.toString(), is(String.format("Please enter validate data again.%n")));
    }
}
