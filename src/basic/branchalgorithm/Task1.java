package basic.branchalgorithm;

import java.util.Scanner;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой
 * треугольник, и если да, то будет ли он прямоугольным.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        int firstCorner = sc.nextInt();
        System.out.println("input b");
        int secondCorner = sc.nextInt();
        int thirdCorner = firstCorner + secondCorner;
        if (thirdCorner < 180) {
            if (thirdCorner == 90) {
                System.out.println("Трекгольник прямоугольный");
            } else {
                System.out.println("Треугольник не прямоугольный");
            }
        } else {
            System.out.println("Нет такого треугольника");
        }
        sc.close();
    }
}
