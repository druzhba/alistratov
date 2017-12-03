package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author alistratov (ant341@yandex.ru)
 * @since 03.12.2017
 * @version 1
 */

public class DummyBotTest {
    /**
     * Test add.
     */
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Привет, Бот"), is("Привет, умник."));
    }
    /**
     * Test add.
     */
    @Test
    public void whenByuBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Пока"), is("До скорой встречи."));
    }
    /**
     * Test add.
     */
    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Сколько будет 2 + 2?"), is("Это ставит меня в тупик. Спросите другой вопрос."));
    }
}