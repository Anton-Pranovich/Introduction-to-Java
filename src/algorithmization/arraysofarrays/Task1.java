package algorithmization.arraysofarrays;

/**
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
 * элемент больше последнего.
 */
public class Task1 {
    public static void main(String[] args) {

        int[][] matrix = {{4, 2, 0}, {7, 3, 4}, {3, 4, 1}};

        int[] firstRow = matrix[0];
        int[] lastRow = matrix[matrix.length - 1];

        printMatrix(matrix);

        for (int[] row : matrix) {
            for (int columnNum = 0; columnNum < row.length; columnNum += 2) {
                if (firstRow[columnNum] > lastRow[columnNum]) {
                    System.out.print(row[columnNum] + "\t");
                }
            }
            System.out.println();
        }
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

