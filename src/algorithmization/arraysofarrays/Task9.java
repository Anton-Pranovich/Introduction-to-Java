package algorithmization.arraysofarrays;

/**
 * . Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму
 */
public class Task9 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[][] matrix = {
                {1, 6, 8},
                {2, 8, 3},
                {6, 2, 4}
        };
        int columnNumber = 0;

        printMatrix(matrix);

        for (int column = 0; column < matrix[0].length; column++) {
            int maxInColumn = 0;
            for (int[] row : matrix) {
                maxInColumn += row[column];
            }
            if (max < maxInColumn) {
                max = maxInColumn;
                columnNumber = column;
            }
        }
        System.out.println("max sum in column:" + columnNumber + ", and max sum equals: " + max);
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Origin matrix:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
