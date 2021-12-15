package algorithmization.arraysofarrays;

/**
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println("print origin matrix");
        printMatrix(matrix);
        int maxValue = findMaxValue(matrix);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] % 2 != 0) {
                    matrix[row][col] = maxValue;
                }
            }
        }
        System.out.println("\nprint the resulting matrix");
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
    private static int findMaxValue(int[][] matrix) {
        int maxValue = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }
        }
        return maxValue;
    }
}
