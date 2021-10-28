package algorithmization.arrays;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами
 */
public class Task6 {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 6, 8, 5, 3, 0, 7};
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            if (index > 0 && index < 4) {
                System.out.println(array[index]);
                sum += index;
            } else if (index % 2 != 0 && index % 3 != 0) {
                System.out.println(array[index]);
                sum += index;
            }
        }
        System.out.println("The sum = " + sum);
    }
}
