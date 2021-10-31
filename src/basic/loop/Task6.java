package basic.loop;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в
 * памяти компьютера.
 */
public class Task6 {
    public static void main(String[] args) {
        for (int j = 0; j <= 255; j++) {
            System.out.println("\"" + (char) j + "\" = " + j);
        }
    }
}
