package lenear;

import java.util.Scanner;

public class Task2 {

    /**
     * Вычислить значение выражения по формуле
     * (все переменные принимают действительные значения):
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        int a = sc.nextInt();
        System.out.println("input b");
        int b = sc.nextInt();
        System.out.println("input c");
        int c = sc.nextInt();
        double z;
        z = ((b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c))) / 2 * a) - ((Math.pow(a, 3)) * c + Math.pow(b, -2));
        System.out.println(z);
        sc.close();
    }
}
