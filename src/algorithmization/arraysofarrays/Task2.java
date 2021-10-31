package algorithmization.arraysofarrays;

/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {2, 5, 4}, {3, 4, 9}};

        for (int[] row : matrix) { //outputting the matrix to the console
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }
        System.out.println();
    }
}
