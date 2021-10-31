package basic.linear;

import java.util.Scanner;

public class Task3 {
    /**
     * Вычислить значение выражения по формуле
     * (все переменные принимают действительные значения):
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input x");
        int x = sc.nextInt();
        System.out.println("input y");
        int y = sc.nextInt();
        double z;
        z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println(z);
        sc.close();
    }
}
