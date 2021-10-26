package loop;

import java.math.BigInteger;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 */
public class Task4 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ONE;
        for (int i = 1; i <= 200; i++) {
            sum = sum.multiply(BigInteger.valueOf(i).pow(2));
        }
        System.out.println(sum);
    }
}
