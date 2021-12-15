package algorithmization.sorting;

import java.util.Arrays;

/**
 * Сортировка выбором. Дана последовательность чисел a1 <= a2 <=...<= an.
 * Требуется переставить элементы так, чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого,
 * выбирается наибольший элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго,
 * эта процедура повторяется. Написать алгоритм сортировки выбором.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5, 6};
        for (int i = (array.length - 1), j = 0; i > j; i--, j++) {
            int buffer = array[i];
            array[i] = array[j];
            array[j] = buffer;
        }
        System.out.println(Arrays.toString(array));
    }
}
