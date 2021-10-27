package algorithmization.oneDimemsionArrays;

/**
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class Task5 {
	public static void main(String[] args) {
		int[] array = { 2, 3, 1, 6, 8, 5, 3, 0, 7 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {
				System.out.println(array[i]);
			}
		}
	}
}
