package algorithmization.arrays;

import java.util.Arrays;

/**
 * Дана последовательность целых чисел
 * a1, a2, ..., an. Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны
 * min(a1, a2, ..., an)
 */
public class Task8 {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 6, 8, 5, 3, 0, 7};
        int min = Integer.MAX_VALUE;
        int newLength = 0;
        int newIndex = 0;
        System.out.println(Arrays.toString(array));//print original array
        for (int index : array) {
            if (index < min) {
                min = index;
            }
        }
        for (int index : array) {
            if (index != min) {
                newLength++;
            }
        }
        int[] newArray = new int[newLength];
        for (int index : array) {
            if (index != min) {
                newArray[newIndex] = index;
                newIndex++;
            }
        }
        System.out.println(Arrays.toString(newArray)); // print  the finished array
    }
}
