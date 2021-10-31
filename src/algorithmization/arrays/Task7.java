package algorithmization.arrays;

/**
 * Даны действительные числа
 * a1, a2, ..., an
 * . Найти max(  a1 + a2n, a2 + a2n−1, ..., an + an+1)
 */

public class Task7 {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 6, 8, 5, 3, 0, 7, 10};
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
            int firstNumber = array[index];
            int secondNumber = array[array.length - 1 - index];
            if ((firstNumber + secondNumber > max) && (index != secondNumber)) {
                max = (array[index] + array[array.length - 1 - index]);
            }
        }
        System.out.println("max = " + max);
    }
}
