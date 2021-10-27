package loop;

import java.util.Scanner;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго
 * числа.
 */
public class Task8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("input m");
            int m = sc.nextInt();
            System.out.println("input n");
            int n = sc.nextInt();
            int c;
            int d;
            while (m > 0) {
                c = m % 10;
                m /= 10;
                d = n;
                while (d > 0) {
                    if (c == d % 10) {
                        System.out.println(c);
                    }
                    d /= 10;
                }
            }
        }
    }
}
