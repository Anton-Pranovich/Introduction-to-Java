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
        for (int i = 0; i < array.length; i++) {
            int firstNumber = array[i];
            int secondNumber = array[array.length - 1 - i];
            if ((firstNumber + secondNumber > max) && (i != secondNumber)) {
                max = (array[i] + array[array.length - 1 - i]);
            }
        }
        System.out.println("max = " + max);
    }
}
