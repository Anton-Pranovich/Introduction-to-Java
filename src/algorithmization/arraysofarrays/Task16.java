package algorithmization.arraysofarrays;

import java.util.Scanner;

/**
 * Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
 * ...,n^2, так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
 * собой. Построить такой квадрат. Пример магического квадрата порядка 3:
 * <p>
 * 6 1 8
 * 7 5 3
 * 2 9 4
 */
public class Task16 {
    public static void main(String[] args) {
        System.out.println("Выберите порядок вывода магического квадрата:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        if (n % 2 != 0) {  // Нечетный порядок
            oddMagic(n, matrix);
        } else if (n % 4 != 0) {  // Одиночный и четный порядок
            return;
        } else {  // Двойной четный порядок
            doubleEvenMagic(n, matrix);
        }
        printMatrix(matrix);
    }

    public static void oddMagic(int n, int[][] array) {
        int row = 0;
        int col = n / 2;
        for (int value = 1; value <= n * n; value++) {
            array[row][col] = value;
            if (value % n == 0) {  // Если текущее число кратно n, спускаемся вниз
                row++;
            } else {  // Если текущее число не кратно n, идем вверх влево
                row--;
                col++;
                if (row < 0) row = n - 1;
                if (col > n - 1) col = 0;
            }
        }
    }

    public static void doubleEvenMagic(int n, int[][] array) {
        int minValue = 1;
        int maxValue = n * n;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row % 4 == col % 4 || (row + col) % 4 == 3) {  // Диагональ перевернута
                    array[row][col] = maxValue;
                } else {  // Недиагональный передний ряд
                    array[row][col] = minValue;
                }
                maxValue--;
                minValue++;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf(value + "\t");
            }
            System.out.println();
        }
    }
}
