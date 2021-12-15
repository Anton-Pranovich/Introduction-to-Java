package algorithmization.sorting;

import java.util.Arrays;

/**
 * Даны две последовательности
 * a1 <= a2 <=...<= an и b1 <= b2 <=...<= bm
 * . Образовать из них новую последовательность
 * чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arrayB = {1, 1, 1, 1, 1, 1, 2, 2, 3, 5};
        int[] arrayA = {2, 3, 5, 5};
        int[] resultArray = new int[arrayA.length + arrayB.length];
        for (int index = 0, arrayAIndex = 0, arrayBIndex = 0; index < resultArray.length; ) {
            if (arrayAIndex < arrayA.length && arrayA[arrayAIndex] <= arrayB[arrayBIndex]) {
                resultArray[index] = arrayA[arrayAIndex];
                index++;
                arrayAIndex++;
            } else {
                resultArray[index] = arrayB[arrayBIndex];
                index++;
                arrayBIndex++;
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
