package algorithmization.araysOfArays;

import java.util.Scanner;
/**	Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 1  2   3    ...n
 n n-1 n-2   ...1
 1  2   3    ...n
 n n-1 n-2   ...1
 .  .   . .    .
 .  .   .  .   .
 .  .   .   .  .
 n n-1 n-2   ...1
 **/

public class Task4 {
	public static void main(String[] args) {
		int n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Введите размер матрицы,n (n- четное)");
			n = sc.nextInt();
		}
		int[][] array = new int[n][n];
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0, a = 1; j < n; j++, a++) {
					array[i][j] = a;
				}
			} else {
				for (int j = 0, a = n; j < n; j++, a--) {
					array[i][j] = a;
				}
			}
		}
		for (int i = 0; i < array.length; i++) { //перебираем весь массив и печатаем его в столбик
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
