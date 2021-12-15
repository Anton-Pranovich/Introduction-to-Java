package algorithmization.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 * дополнительный массив.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("input value K");
        int k = sc.nextInt();
        if (k + 1 < firstArray.length) {
            int[] resultArray = sorting(firstArray, secondArray, k);
            System.out.println(Arrays.toString(resultArray));
        } else {
            System.out.println("k+1 must be smaller than firstArray length, " + "k+1 = " + (k + 1) + ", firstArray length = " + firstArray.length);
        }
    }

    private static int[] sorting(int[] firstArray, int[] secondArray, int k) {
        int[] resultArray = new int[firstArray.length + secondArray.length];
        for (int index = 0, firstArrayIndex = 0; index < resultArray.length; ) {
            if (index != k + 1) {
                resultArray[index] = firstArray[firstArrayIndex];
                firstArrayIndex++;
                index++;
            } else {
                int secondArrayIndex = 0;
                while (secondArrayIndex < secondArray.length) {
                    resultArray[index] = secondArray[secondArrayIndex];
                    index++;
                    secondArrayIndex++;
                }
            }
        }
        return resultArray;
    }
}
