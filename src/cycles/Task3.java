package cycles;

import java.util.Scanner;

/**
 * Найти сумму квадратов первых ста чисел.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += (i * i);
        }
        System.out.println(sum);
        sc.close();
    }
}
