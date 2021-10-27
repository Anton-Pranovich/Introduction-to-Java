package algorithmization.oneDimemsionArrays;

/**
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */
public class Task3 {
    public static void main(String[] args) {
        int neg = 0;
        int zero = 0;
        int pos = 0;
        int[] arr = {3, 5, 0, -5, 2, -8, 0};
        for (int i : arr) {
            if (i < 0) {
                neg++;
            } else if (i == 0) {
                zero++;
            } else {
                pos++;
            }
        }
        System.out.println("neg: " + neg + " zero: " + zero + " pos " + pos);
    }
}
