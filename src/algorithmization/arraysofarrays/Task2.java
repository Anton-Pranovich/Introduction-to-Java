package algorithmization.arraysofarrays;

/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {2, 5, 4}, {3, 4, 9}};
        printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }
        System.out.println();
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
