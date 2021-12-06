package algorithmization.arraysofarrays;

/**
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class Task12 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {4, 3, 2, 1},
                {5, 6, 7, 8},
                {8, 7, 6, 5}
        };
        System.out.println("Origin matrix:");
        printMatrix(matrix);

        boolean isSorted = false;
        int buffer;

        for (int row = 0; row < matrix.length; row++) {
            while (!isSorted) {
                isSorted = true;
                for (int col = 0; col < matrix[row].length - 1; col++) {
                    if (matrix[row][col] > matrix[row][col + 1]) {
                        isSorted = false;
                        buffer = matrix[row][col];
                        matrix[row][col] = matrix[row][col + 1];
                        matrix[row][col + 1] = buffer;
                    }
                }
            }
            isSorted = false;
        }
        System.out.println("\nAscending sort matrix");
        printMatrix(matrix);
        for (int row = 0; row < matrix.length; row++) {
            while (!isSorted) {
                isSorted = true;
                for (int col = 0; col < matrix[row].length - 1; col++) {
                    if (matrix[row][col] < matrix[row][col + 1]) {
                        isSorted = false;
                        buffer = matrix[row][col];
                        matrix[row][col] = matrix[row][col + 1];
                        matrix[row][col + 1] = buffer;
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
