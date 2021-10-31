package algorithmization.arrays;

import java.util.Arrays;

/**
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
 */
public class Task4 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexMax = -1;
        int indexMin = -1;
        int buf;
        int[] array = {2, 3, 1, 6, 8, 5, 3, 0, 7};
        System.out.println(Arrays.toString(array));
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
                indexMax = index;
            }
            if (array[index] < min) {
                min = array[index];
                indexMin = index;
            }
        }
        buf = array[indexMax];
        array[indexMax] = array[indexMin];
        array[indexMin] = buf;
        System.out.println(Arrays.toString(array));
    }
}
