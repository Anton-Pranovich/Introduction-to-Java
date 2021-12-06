package algorithmization.arraysofarrays;

/**
 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 5, 8},
                {2, 3, 6, 7},
                {3, 2, 7, 6},
                {4, 1, 8, 5}
        };
        System.out.println("Origin matrix:");
        printMatrix(matrix);

        boolean isSorted = false;
        int buffer;

        for (int col = 0; col < matrix.length; col++) {
            while (!isSorted) {
                isSorted = true;
                for (int row = 0; row < matrix[row].length - 1; row++) {
                    if (matrix[row][col] > matrix[row + 1][col]) {
                        isSorted = false;
                        buffer = matrix[row][col];
                        matrix[row][col] = matrix[row + 1][col];
                        matrix[row + 1][col] = buffer;
                    }
                }
            }
            isSorted = false;
        }
        System.out.println("\nAscending sort matrix");
        printMatrix(matrix);
        for (int col = 0; col < matrix.length; col++) {
            while (!isSorted) {
                isSorted = true;
                for (int row = 0; row < matrix[row].length - 1; row++) {
                    if (matrix[row][col] < matrix[row + 1][col]) {
                        isSorted = false;
                        buffer = matrix[row][col];
                        matrix[row][col] = matrix[row + 1][col];
                        matrix[row + 1][col] = buffer;
                    }
                }
            }
            isSorted = false;
        }
        System.out.println("\nDescending sort");
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
