package basic.branchalgorithm;

import java.util.Scanner;

/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
 * расположены на одной прямой.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input x1");
        int x1 = sc.nextInt();
        System.out.println("input x2");
        int x2 = sc.nextInt();
        System.out.println("input x3");
        int x3 = sc.nextInt();
        System.out.println("input y1");
        int y1 = sc.nextInt();
        System.out.println("input y2");
        int y2 = sc.nextInt();
        System.out.println("input y3");
        int y3 = sc.nextInt();
        // first version
        if (((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1))) {
            System.out.println("Лежат на одной прямой");
        } else {
            System.out.println("Не лежат на одной прямой");
        }

        // second version
        if (((x1 / y1) == (x2 / y2)) && ((x2 / y2) == (x3 / y3))
                || ((y1 / x1) == (y2 / x2)) && ((y2 / x2) == (y3 / x3))) {
            System.out.println("Лежат на одной прямой");
        } else {
            System.out.println("Не лежат на одной прямой");
        }
        sc.close();
    }
}
