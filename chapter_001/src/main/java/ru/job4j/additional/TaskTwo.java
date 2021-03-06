package ru.job4j.additional;
// Имеется два отсортированных массива, объединить их не создавая третий и отсортировать

import java.util.Arrays;

/**
 * Class TaskTwo объеденяет и сортирует массив.
 * @author alistratov
 * @since 24.12.2017
 * @version 1
 */
public class TaskTwo {
    /**
     * Объединяет и сортирует массив.
     * @param array1 первый массив.
     * @param array2 второй массив.
     * @return массив.
     */
    public int[] sort(int[] array1, int[] array2) {
        int p = array1.length + array2.length;
        array2 = Arrays.copyOf(array2, p);
        int m = array2.length - array1.length;
        for (int i = m, j = 0; i < array2.length; i++, j++) {
            array2[i] = array1[j];
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 1; j < array2.length; j++) {
                if (array2[j - 1] > array2[j]) {
                    int number = array2[j - 1];
                    array2[j - 1] = array2[j];
                    array2[j] = number;
                }
            }
        }
        return array2;
    }
}
