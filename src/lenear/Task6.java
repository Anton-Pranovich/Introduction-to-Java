package lenear;

import java.util.Scanner;

public class Task6 {
    /**
     * Для данной области составить линейную программу, которая печатает true, если
     * точка с координатами (х, у) принадлежит закрашенной области, и false — в
     * противном случае:
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input x");
        int x = sc.nextInt();
        System.out.println("input y");
        int y = sc.nextInt();
        if (((y < 0 && y > -4) && (x < 5 && x > -5)) || ((y > 0 && y < 5) && (x > -3) && (x < 3))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        sc.close();
    }
}
