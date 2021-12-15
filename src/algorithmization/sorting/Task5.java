package algorithmization.sorting;

import java.util.Arrays;

/**
 * Сортировка вставками. Дана последовательность чисел  a1 ,a2 ,... ,an. Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть a1, a2,..., ai - упорядоченная последовательность, т. е.
 * a1 <= a2 <=...<= an. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 9, 2, 5, 8, 7, 4};
        //  int[] sortedArray = new int[array.length];
        for (int index = 1, high = 0; index < array.length; index++, high++) {
            if (array[index] < array[index - 1]) {
                int buffer = array[index];
                int searchIndex = binarySearch(array, array[index], high);
                int currentIndex = index;
                while (searchIndex < currentIndex) {
                    array[currentIndex] = array[currentIndex - 1];
                    currentIndex--;
                }
                array[searchIndex] = buffer;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int binarySearch(int[] sortedArray, int key, int high) {
        int index = -1;
        int low = 0;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (middle - 1 >= 0 && key > sortedArray[middle - 1] && key < sortedArray[middle]) {
                index = middle;
                break;
            } else if (sortedArray[middle] > key) {
                high = middle - 1;
            } else if (sortedArray[middle] < key) {
                low = middle + 1;
            } else if (sortedArray[middle] == key) {
                index = middle;
                break;
            }
        }
        return index;

    }

}
