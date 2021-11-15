package algorithmization.arraysofarrays;

import java.util.Scanner;

/**
 * 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры
 */

public class Task8 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println("Print origin matrix");
        printMatrix(matrix);

        int firstColumn;
        int secondColumn;

        int columnCount = matrix[0].length;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("input first column number from 0 to " + (columnCount - 1));
            firstColumn = sc.nextInt();
            while ((firstColumn < 0 || firstColumn >= columnCount)) {
                System.out.println("column number is valid. input first column number from 0 to " + (columnCount - 1));
                firstColumn = sc.nextInt();
            }
            System.out.println("input second column number from 0 to " + (columnCount - 1));
            secondColumn = sc.nextInt();
            while (secondColumn < 0 || secondColumn >= columnCount) {
                System.out.println("input number is not valid. input second column number from 0 to " + (columnCount - 1));
                secondColumn = sc.nextInt();
            }

        }

        // swap columns
        for (int[] row : matrix) {
            int temp = row[firstColumn];
            row[firstColumn] = row[secondColumn];
            row[secondColumn] = temp;
        }
        System.out.println("Print new matrix:");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }
}
