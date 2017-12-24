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
     * @param args аргументы.
     */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8};
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
        for (int i : array2) {
            System.out.println(i);
        }

    }
}
