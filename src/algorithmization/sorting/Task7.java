package algorithmization.sorting;

import java.util.Arrays;

/**
 * Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <=...<= an и b1 <= b2 <=...<= bm.
 * Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <=...<= bm
 * в первую последовательность так, чтобы новая последовательность оставалась возрастающей
 */
public class Task7 {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5, 7, 9};
        int[] arrayB = {2, 4, 5, 6, 8, 10};
        int[] sortedArray = new int[arrayA.length + arrayB.length];
        int indexA = 0;
        int indexB = 0;
        for (int index = 0; index < sortedArray.length; index++) {
            if (indexA < arrayA.length && arrayA[indexA] < arrayB[indexB]) {
                sortedArray[index] = arrayA[indexA];
                indexA++;
            } else {
                if (indexB < arrayB.length) {
                    sortedArray[index] = arrayB[indexB];
                    indexB++;
                }
            }
        }
        System.out.println(Arrays.toString(sortedArray));
    }
}
