package ru.job4j.additional;
// Задача: отсортировать массив с помощью одного цикла
/**
 * Class TaskOne сортирует массив.
 * @author alistratov
 * @since 24.12.2017
 * @version 1
 */
public class TaskOne {
    /**
     * Сортирует массив.
     * @param args аргументы.
     */
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 12, 1};
        for (int i = array.length - 1; i > 0;) {
            if (array[i] < array[i - 1]) {
                int c = array[i];
                array[i] = array[i - 1];
                array[i - 1] = c;
                i = array.length - 1;
            } else {
                i--;
            }
        }
        for (int j : array) {
            System.out.println(j);
            }
        }
}


