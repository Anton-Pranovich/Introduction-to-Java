package algorithmization.oneDimemsionArrays;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами
 */
public class Task6 {
	public static void main(String[] args) {
		int[] array = { 2, 3, 1, 6, 8, 5, 3, 0, 7 };
		for (int i = 0; i < array.length; i++) {
			if (i > 0 && i < 4) {
				System.out.println(array[i]);
			} else if (i % 2 != 0 && i % 3 != 0) {
				System.out.println(array[i]);
			}
		}
	}
}
