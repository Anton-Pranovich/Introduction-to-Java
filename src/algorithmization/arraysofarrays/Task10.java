package algorithmization.arraysofarrays;

/**
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class Task10 {
    public static void main(String[] args) {
        int[][] matrix = {{10, 2, 3, 4}, {-1, -2, -3, -4}, {5, 6, 70, 8}, {-5, -6, -7, -8}};
        String positiveElement = "";
        printMatrix(matrix);

        for (int index = 0; index < matrix.length; index++) {
            if (matrix[index][index] >= 0) {
                positiveElement += matrix[index][index] + "; ";
            }
        }
        System.out.println("positive elements in the main diagonal of the matrix: " + positiveElement);
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
