package cycles;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input m");
        int m = sc.nextInt();
        System.out.println("input n");
        int n = sc.nextInt();
        for (; m <= n; m++) {
            for (int j = 2; j < m; j++) {
                if ((m % j == 0)) {
                    System.out.println("m = " + m + " j= " + j);
                }
            }
        }
        sc.close();
    }
}
