package algorithmization.arraysofarrays;

import java.util.Scanner;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * * 1  1  1 ... 1 1 1
 * * 0  1  1 ... 1 1 0
 * * 0  0  1 ... 1 0 0
 * * .  .  .  .    .
 * * .  .  .   .   .
 * * .  .  .    .  .
 * * 0  1  1 ... 1 1 0
 * * 1  1  1 ... 1 1 1
 */

public class Task6 {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input matrix size,n (n- even)");
            n = sc.nextInt();
            while (n <= 0 || n % 2 != 0) {
                System.out.println("n is not validate. Input matrix size,n (n- even)");
                n = sc.nextInt();
            }
        }
        int[][] matrix = new int[n][n];
        int count = 0;
        int endIndexColumn = matrix.length;
        int row = 0;
        //Filling the first half of an array with numbers
        for (int index = row; index < matrix.length && count < endIndexColumn; index++) {
            for (int startIndexColumn = count; startIndexColumn < endIndexColumn; startIndexColumn++) {
                matrix[index][startIndexColumn] = 1;
            }
            count++;
            endIndexColumn--;
            row++;
        }
        //Filling the second half of an array with numbers
        for (int index = row; endIndexColumn < matrix.length && index < matrix.length; index++) {
            count--;
            endIndexColumn++;
            for (int startIndexColumn = count; startIndexColumn < endIndexColumn; startIndexColumn++) {
                matrix[index][startIndexColumn] = 1;
            }
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
