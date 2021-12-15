package algorithmization.arraysofarrays;

import java.util.Random;

/**
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца
 */
public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = 10;
        int n = 10;
        int[][] matrix = new int[m][n];

        for (int col = 0; col < n; col++) {
            int count = 0;
            while (count < col) {
                int randomRow = random.nextInt(m);
                if (matrix[randomRow][col] != 1) {
                    matrix[randomRow][col] = 1;
                    count++;
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

