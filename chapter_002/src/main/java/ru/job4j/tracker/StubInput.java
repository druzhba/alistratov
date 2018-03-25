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
	private final String[] answer;
	/**
	 * Считает количество вызовов методом ask.
	 */
	private int position;

	/**
	 * Конструктор.
	 * @param answer последовательность ответов
	 */
	public StubInput(String[] answer) {
		this.answer = answer;
	}

	/**
	 * Метод спрашивает вопрос.
	 * @param question вопрос
	 * @return последовательность ответов
	 */
	@Override
	public String ask(String question) {
		return this.answer[this.position++];
	}

	/**
	 * Метод.
	 * @param question вопрос
	 * @param range промежуток
	 * @return ответ
	 */
	public int ask(String question, int[] range) {
		return -1;
	}
}