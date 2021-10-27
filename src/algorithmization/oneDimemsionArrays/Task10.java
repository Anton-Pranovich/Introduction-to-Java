package algorithmization.oneDimemsionArrays;

import java.util.Arrays;

/**
 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class Task10 {
	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 8, 5, 2, 6, 9, 8, 2, 4, 3, 1, 5 };
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				array[i] = 0;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
