package cycles;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 */
public class Task4 {
    public static void main(String[] args) {
        long sum = 1;
        for (long i = 1; i <= 200; i++) {
            sum *= (i * i);
        }
        System.out.println(sum);
        // Число выходит за длину long и умнажает в итоге на 0, а при double пишет
        // Infinity
    }
}
