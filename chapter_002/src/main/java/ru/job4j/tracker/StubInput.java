package ru.job4j.tracker;
/**
 * Class StubInput.
 * @author Anton Listratov
 * @since 23.01.2018
 * @version 1
 */
public class StubInput implements Input {
	/**
	 * Последовательность ответов пользователя.
	 */
	private final String[] value;
	/**
	 * Считает количество вызовов методом ask.
	 */
	private int position;

	/**
	 * Конструктор.
	 * @param value последовательность ответов
	 */
	public StubInput(final String[] value) {
		this.value = value;
	}

	/**
	 * Метод спрашивает вопрос.
	 * @param question вопрос
	 * @return последовательность ответов
	 */
	@Override
	public String ask(String question) {
		return this.value[this.position++];
	}
}