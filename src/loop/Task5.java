package loop;

import java.util.Scanner;

/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
 * которых больше или равен заданному е. Общий член ряда имеет вид:
 */
public class Task5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("input e");
            double e = sc.nextDouble();
            double sum = 0;
            double a = 1;
            if (e > 0) {
                for (int i = 1; a >= e; i++) {
                    a = (Math.pow(2, -i) + Math.pow(3, -i));
                    sum += a;
                }
                System.out.println(sum);
            }
        }
    }
}
