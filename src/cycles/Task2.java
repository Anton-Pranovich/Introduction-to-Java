package cycles;

import java.util.Scanner;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        int a = sc.nextInt();
        System.out.println("input b");
        int b = sc.nextInt();
        System.out.println("input h");
        int h = sc.nextInt();
        int y;
        for (int x = a; a <= b - h; a += h) {
            if (x > 2) {
                y = x;
                System.out.println("y = "+y);
            }
            if (x <= 2) {
                y = -x;
                System.out.println("y = "+y);
            }
        }
        sc.close();
    }
}
