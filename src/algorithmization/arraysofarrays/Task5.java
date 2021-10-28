package algorithmization.arraysofarrays;

import java.util.Scanner;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1  1   1 ... 1 1 1
 * 2  2   2 ... 2 2 0
 * 3  3   3 ... 3 0 0
 * .  .   . .    .
 * .  .   .  .   .
 * .  .   .   .  .
 * n n-1  0 ... 0 0 0
 * n   0  0 ... 0 0 0
 **/
public class Task5 {
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
        int value = 1;
        int numberToFill = n;
        int[][] matrix = new int[n][n];
        for (int rowNum = 0; rowNum < n; rowNum++) {
            for (int columnNum = 0; columnNum < numberToFill; columnNum++) {
                matrix[rowNum][columnNum] = value;
            }
            numberToFill--;
            value++;
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
