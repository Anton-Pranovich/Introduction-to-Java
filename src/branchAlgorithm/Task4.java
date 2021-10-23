package branchAlgoritm;

import java.util.Scanner;

/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        int a = sc.nextInt();
        System.out.println("input b");
        int b = sc.nextInt();
        System.out.println("input x");
        int x = sc.nextInt();
        System.out.println("input y");
        int y = sc.nextInt();
        System.out.println("input z");
        int z = sc.nextInt();
        if (a > x) {
            if ((b > y) || (b > z)) {
                System.out.println("Пройдет");
            }
        } else if (a > y) {
            if ((b > x) || (b > z)) {
                System.out.println("Пройдет");
            }
        } else if (a > z) {
            if ((b > x) || (b > y)) {
                System.out.println("Пройдет");
            }
        } else {
            System.out.println("Не пройдет");
        }
        sc.close();
    }
}
