package algorithmization.arrays;

/**
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class Task5 {
	public static void main(String[] args) {
		int[] array = { 2, 3, 1, 6, 8, 5, 3, 0, 7 };
		for (int index = 0; index < array.length; index++) {
			if (array[index] > index) {
				System.out.println( "array[index] "+array[index] + " > " +" index "+ index);
			}
		}
	}
}
