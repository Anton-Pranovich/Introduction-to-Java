package algorithmization.arrays;

import java.util.Arrays;

/**
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап.
 * Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен
 */
public class Task2 {
    public static void main(String[] args) {
        int z = 12;
        int count = 0;
        int[] array = {2, 43, 45, 234, 54, 3, 56};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }
}
