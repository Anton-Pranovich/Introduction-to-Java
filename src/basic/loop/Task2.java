package basic.loop;

import java.util.Scanner;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 */
public class Task2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("input a");
            int a = sc.nextInt();
            System.out.println("input b");
            int b = sc.nextInt();
            System.out.println("input h");
            int h = sc.nextInt();
            int y;
            for (; a <= b - h; a += h) {
                if (a > 2) {
                    y = a;
                } else {
                    y = -a;
                }
                System.out.println("y = " + y);
            }
        }
    }
}
