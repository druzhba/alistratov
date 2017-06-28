package ru.job4j.calculator;

/**
 * Class Calculator для сложения,вычитания,деления,умножения двух чисел.
 * @author listratov
 * @since 28.06.2017
 * @version 1
 */
public class Calculator {
/**
 * Результат вычисления.
 */
	private double result;
/**
 * Сложение.
 * @param first первый аргумент.
 * @param second второй аргумент.
 */
	public void add(double first, double second) {
		this.result = first + second;
	}
/**
 * Вычитание.
 * @param first первый аргумент.
 * @param second второй аргумент.
 */
	public void subtract(double first, double second) {
		this.result = first - second;
	}
/**
 * Деление.
 * @param first первый результат.
 * @param second второй результат.
 */
	public void div(double first, double second) {
		this.result = first / second;
	}
/**
 * Умножение.
 * @param first первый результат.
 * @param second второй результат.
 */
	public  void multiple(double first, double second) {
		this.result = first * second;
	}
/**
 * Получение результата.
 * @return результат.
 */
	public double getResult() {
		return this.result;
	}
}