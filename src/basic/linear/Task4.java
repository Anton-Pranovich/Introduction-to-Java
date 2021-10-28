package basic.linear;

import java.util.Scanner;

public class Task4 {
    /**
     * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
     * Поменять местами дробную и целую части числа и вывести полученное значение числа.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input x");
        double x = sc.nextDouble();
        x *= 1000;
        int a = (int) (x / 1000);
        System.out.println(a);
        double b = x % 1000;
        System.out.println(b);
        double z = b + ((double) a / 1000);
        System.out.println(z);
        sc.close();
    }
}
