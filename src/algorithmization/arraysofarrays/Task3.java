package algorithmization.arraysofarrays;

import java.util.Scanner;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class Task3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Дана матрица:");
            int[][] matrix = {{1, 2, 3, 4}, {4, 5, 6, 7}, {4, 5, 7, 8}, {2, 5, 9, 7}};
            printMatrix(matrix);

            int numberOfRows = matrix.length - 1;
            int numberOfColumns = matrix[0].length - 1;

            System.out.println("Input row number from 0 to " + numberOfRows);
            int rowNumber = sc.nextInt();
            if (rowNumber < 0 || rowNumber >= matrix.length) {
                System.out.println("Row number is invalid. Input row number from 0 to " + numberOfRows);
                rowNumber = sc.nextInt();
            }

            System.out.println("Input column number from 0 to " + numberOfColumns);
            int columnNumber = sc.nextInt();
            if (columnNumber < 0 || columnNumber >= matrix[0].length) {
                System.out.println("Column number is invalid. Input column number from 0 to " + numberOfColumns);
                columnNumber = sc.nextInt();
            }
            printRow(matrix, rowNumber);
            printColumn(matrix, columnNumber);
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    private static void printColumn(int[][] matrix, int columnNumber) {
        System.out.println("Printing column number: " + columnNumber);
        for (int[] row : matrix) {
            System.out.println(row[columnNumber] + "\t");
        }
        System.out.println();
    }

    private static void printRow(int[][] matrix, int rowNumber) {
        System.out.println("Printing row number: " + rowNumber);
        for (int column : matrix[rowNumber]) {
            System.out.print(column + "\t");
        }
        System.out.println();
    }
}
