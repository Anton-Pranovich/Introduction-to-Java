package algorithmization.arraysofarrays;

import java.util.Random;

/**
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз
 */
public class Task11 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(16);
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println("row number is " + i);
            }
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Origin matrix:");
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }
}
