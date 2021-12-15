package algorithmization.sorting;

import java.util.Arrays;

/**
 * Сортировка обменами. Дана неотсортированная последовательность чисел. Требуется переставить числа в
 * порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, то делается перестановка.
 * Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = {6, 1, 5, 7, 2, 6, 5, 1, 6, 4, 2};
        int count = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int index = 0; index < array.length; index++) {
                if ((index + 1) < array.length && array[index] > array[index + 1]) {
                    isSorted = false;
                    int buffer = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = buffer;
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("count of permutations = " + count);
    }
}
