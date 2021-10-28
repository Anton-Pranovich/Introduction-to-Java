package algorithmization.arrays;

public class Task1 {
    /**
     * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
     * кратны данному К
     */
    public static void main(String[] args) {
        int sum = 0;
        int k = 3;
        int[] array = {2, 4, 3, 5, 6, 8, 4, 76, 34, 99, 666, 34};
        for (int i : array) {
            if (i % k == 0) {
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("Sum = " + sum);
    }
}
