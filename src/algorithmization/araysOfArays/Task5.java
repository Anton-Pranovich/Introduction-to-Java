package algorithmization.araysOfArays;

import java.util.Scanner;

/**	Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 1  1   1 ... 1 1 1
 2  2   2 ... 2 2 0
 3  3   3 ... 3 0 0
 .  .   . .    .
 .  .   .  .   .
 .  .   .   .  .
 n n-1  0 ... 0 0 0
 n   0  0 ... 0 0 0
 **/
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы,n (n- четное)");
        int n = sc.nextInt();
        int number = 1;
        int[][] array = new int[n][n];
        for (int i = 0, a = n; i < n; i++) {
            for (int j = 0; j < a; j++) {
                array[i][j] = number;
            }
            a--;
            number++;
        }
        for (int i = 0; i < array.length; i++) { //перебираем весь массив и печатаем его в столбик
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
