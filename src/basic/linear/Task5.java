package basic.linear;

import java.util.Scanner;

public class Task5 {
    /**
     * Дано натуральное число Т, которое представляет длительность прошедшего
     * времени в секундах. Вывести данное значение длительности в часах, минутах и
     * секундах в следующей форме: ННч ММмин SSc.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input Time t");
        int t = sc.nextInt();
        int hours = t / 3600;
        int minutes = (t % 3600) / 60;
        int seconds = (t % 3600) % 60;
        System.out.println(hours + " ч " + minutes + " мин " + seconds + " сек ");
        sc.close();
    }
}
