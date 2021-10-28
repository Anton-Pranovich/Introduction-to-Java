package basic.linear;

import java.util.Scanner;

public class Task1 {
    /**
     * Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        int a = sc.nextInt();
        System.out.println("input b");
        int b = sc.nextInt();
        System.out.println("input c");
        int c = sc.nextInt();
        int z;
        z = ((a - 3) * b / 2) + c;
        System.out.println(z);
        sc.close();
    }
}
