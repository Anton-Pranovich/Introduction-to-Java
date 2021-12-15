package algorithmization.sorting;

import java.util.Arrays;

/**
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai < ai+1, то продвигаются
 * на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] array = {6, 1, 2, 3, 5, 9, 8, 5, 7, 6, 2};
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int index = 0; index < array.length; index++) {
                if ((index + 1) < array.length && array[index] > array[index + 1]) {
                    isSorted = false;
                    int buffer = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = buffer;
                    index--;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
