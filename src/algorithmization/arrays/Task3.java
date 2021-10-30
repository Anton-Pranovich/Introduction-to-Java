package algorithmization.arrays;

/**
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */
public class Task3 {
    public static void main(String[] args) {
        int negativeCount = 0;
        int zeroCount = 0;
        int positiveCount = 0;
        int[] array = {3, 5, 0, -5, 2, -8, 0};
        for (int value : array) {
            if (value < 0) {
                negativeCount++;
            } else if (value == 0) {
                zeroCount++;
            } else {
                positiveCount++;
            }
        }
        System.out.println("negative count: " + negativeCount + " zero count: " + zeroCount + " positive count " + positiveCount);
    }
}
