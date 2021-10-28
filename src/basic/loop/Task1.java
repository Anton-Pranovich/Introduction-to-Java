package basic.loop;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */
public class Task1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите любое целое положительной число");
            int number = sc.nextInt();
            int sum = 0;
            for (int i = 1; i < number; i++) {
                sum += i;
            }
            System.out.println("Сумма всех положительный чисел от 1 до " + number + " равна: " + sum);
        }
    }
}
