package algorithmization.arraysofarrays;

import java.util.Scanner;
/**	Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 1  2   3    ...n
 n n-1 n-2   ...1
 1  2   3    ...n
 n n-1 n-2   ...1
 .  .   . .    .
 .  .   .   .  .
 n n-1 n-2   ...1
 **/

public class Task4 {
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
        for (int rowNum = 0; rowNum < n; rowNum++) {
            if (rowNum % 2 == 0) {
                for (int columnNum = 0, value = 1; columnNum < n; columnNum++, value++) {
                    matrix[rowNum][columnNum] = value;
                }
            } else {
                for (int columnNum = 0, value = n; columnNum < n; columnNum++, value--) {
                    matrix[rowNum][columnNum] = value;
                }
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
