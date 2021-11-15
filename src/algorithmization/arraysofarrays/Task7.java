package algorithmization.arraysofarrays;

import java.util.Scanner;

/**
 * Сформировать квадратную матрицу порядка N по правилу:
 * A[I,J] = sin((I^2-J^2)/N),
 * и подсчитать количество положительных элементов в ней.
 */
public class Task7 {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input matrix size n, (n > 0)");
            n = sc.nextInt();
            while (n <= 0) {
                System.out.println("n is not validate. Input matrix size,n (n > 0)");
                n = sc.nextInt();
            }
        }
        double[][] matrix = new double[n][n];
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = value(row, column, n);
                if (matrix[row][column] > 0) {
                    count++;
                }
            }
        }
        System.out.println("positive elements count = " + count);
        printMatrix(matrix);
    }

    private static double value(int i, int j, int n) {
        return Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.6f.\t", value);
            }
            System.out.println();
        }
    }
}
