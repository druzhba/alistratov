package ru.job4j.additional;
// Задача: проверить отсортирован массив или нет
/**
 * Class TaskOne сортирует массив.
 * @author alistratov
 * @since 24.12.2017
 * @version 1
 */
public class TaskOne {
    /**
     * Сортирует массив.
     * @param array массив.
     * @return результат.
     */
    public boolean isSorted(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }
         return true;
    }
}


