package basic.branchalgorithm;

import java.util.Scanner;

/**
 * Вычислить значение функции
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input x");
        int x = sc.nextInt();
        double y;
        if (x <= 3) {
            y = ((Math.pow(x, 2)) - (3 * x) + 9);
        } else {
            y = 1 / ((Math.pow(x, 3)) + 6);
        }
        System.out.println(y);
        sc.close();
    }
}
