package ru.job4j.tracker;

/**
 * Class ValidateInput.
 * @author Anton Listratov
 * @since 20.03.2018
 * @version 1
 */
public class ValidateInput extends ConsoleInput {
    /**
     * Метод ask.
     * @param question вопрос
     * @param range промежуток
     * @return ответ
     */
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Please select key from menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}
