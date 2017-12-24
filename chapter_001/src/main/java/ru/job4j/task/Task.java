package ru.job4j.task;

/**
 * Class task проверяет что слово находится в другом слове.
 * @author alistratov
 * @since 24.12.2017
 * @version 1
 */
public class Task {
    /**
     * Проверяет что слово находится в другом слове.
     * @param origin слово
     * @param sub проверяемое слово
     * @return результат
     */
    public boolean contains(String origin, String sub) {
        char[] originalChar = origin.toCharArray();
        char[] subChar = sub.toCharArray();
        int sum = 0;
        for (int i = 0, j = 0; j < originalChar.length; j++) {
                if (subChar[i] == originalChar[j]) {
                    sum++;
                    i++;
                } else {
                    sum = 0;
                }
                if (i >= subChar.length) {
                    break;
            }
        }
        return sum == subChar.length;

    }
}
