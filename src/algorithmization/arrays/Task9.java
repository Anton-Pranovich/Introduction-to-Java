package algorithmization.arrays;

import java.util.Scanner;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них.
 */
public class Task9 {
    public static void main(String[] args) {
        int numMax = 0;
        int maxCount;
        int identicalNumbersCount = 0;
        int numberCountOfArray = 0;
        int repeatNumbersCount = 0;
        int minNumber;
        int arrayLength;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("input array size, n");
            arrayLength = sc.nextInt();
            int[] originArray = new int[arrayLength];
            int[] repetitionArray = new int[arrayLength];
            int[] minRepetitionsNumberArray = new int[arrayLength];

            for (int i = 0; i < originArray.length; i++) {
                System.out.println("input number");
                originArray[i] = sc.nextInt();// Заполняем массив числами
            }
            for (int i = 0; i < originArray.length; i++) {
                for (int j = i; j < originArray.length; j++) {
                    if (originArray[i] == originArray[j])
                        numberCountOfArray++; // Находим сколько раз каждое число находится в массиве
                }
                repetitionArray[i] = numberCountOfArray;
                numberCountOfArray = 0; // Заполняем массив repetitionArray этими значениями
            }
            for (int j : repetitionArray) {
                if (j == 1)
                    identicalNumbersCount++; // Если весь массив равен единице, то все элементы различны
            }
            if (identicalNumbersCount == repetitionArray.length)
                System.out.println("Повторяющиеся элементы отсутствуют");
            else {
                maxCount = repetitionArray[0];
                for (int i = 0; i < repetitionArray.length; i++) {
                    if (maxCount < repetitionArray[i]) {
                        maxCount = repetitionArray[i];
                        repeatNumbersCount = i;
                    } // Находим максимальное количество повторяющихся элементов
                }
                for (int j : repetitionArray) {
                    if (maxCount == j) {
                        numMax++;
                    } // Находим количество максимально повторяющихся элементов
                }
                if (numMax == 1) { // Если их количество равно 1 ,то одно число повторяется максимальное количество
                    // раз
                    System.out.println("Число " + originArray[repeatNumbersCount] + " встречается " + maxCount + " раза"); // Выводим это число
                } else {
                    for (int i = 0; i < repetitionArray.length; i++) {
                        if (repetitionArray[i] == maxCount) {
                            minRepetitionsNumberArray[i] = originArray[i];
                        } // Если же таких элементов несколько ,то заполняем новый массив D этими
                        // элементами
                    }
                    minNumber = minRepetitionsNumberArray[0];
                    for (int value : minRepetitionsNumberArray) {
                        if (minNumber > value && value != 0) {
                            minNumber = value;
                        } // Находим в массиве D минимальное число
                    }
                    System.out.println("Число " + minNumber + " встречается " + maxCount + " раза"); // Выводим минимальное число в
                    // массиве ,которое встречается
                    // максимальное количество раз
                }
            }
        }
    }
}
