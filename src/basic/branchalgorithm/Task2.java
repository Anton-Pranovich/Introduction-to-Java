package basic.branchalgorithm;

import java.util.Scanner;

/**
 * Найти max{min(a, b), min(c, d)}
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        int a = sc.nextInt();
        System.out.println("input b");
        int b = sc.nextInt();
        System.out.println("input c");
        int c = sc.nextInt();
        System.out.println("input d");
        int d = sc.nextInt();
        int firstMin = Math.min(a, b);
        int secondMin = Math.min(c, d);
        int max = Math.max(firstMin, secondMin);
        System.out.println(max);
        sc.close();
    }
}
