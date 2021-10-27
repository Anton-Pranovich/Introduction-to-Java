package algorithmization.araysOfArays;

import java.util.Scanner;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class Task3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Дана матрица:");
            int[][] array = {{1, 2, 3, 4}, {4, 5, 6, 7}, {4, 5, 7, 8}, {2, 5, 9, 7}};
            int lineCount = -1;
            int columnCount = -1;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                    columnCount++;
                }
                System.out.println();
                lineCount++;
            }
            System.out.println("Введите номер строки от 0 до" + lineCount + " и номер столбца от 0 до " + columnCount);
            System.out.println("Введите номер строки");
            int lineNumber = sc.nextInt();
            System.out.println("Введите номер столбца");
            int columnNumber = sc.nextInt();

            if (lineNumber >= array.length || columnNumber >= array[lineCount - 1].length) {
                System.out.println("Введены не коректные данные");
                System.exit(0);
            }
            System.out.println("Введенный номер строки");
            for (int i = 0; i < array.length; i++) {
                if (i == lineNumber) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j]);
                    }
                }
            }
            System.out.println();
            System.out.println("Введенный номер столбца ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (j == columnNumber) {
                        System.out.println(array[i][j]);
                    }
                }
            }
        }
    }
}
