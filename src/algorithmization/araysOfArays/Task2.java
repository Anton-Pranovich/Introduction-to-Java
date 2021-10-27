package algorithmization.araysOfArays;

/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task2 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {2, 5, 4}, {3, 4, 9}};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][i]);
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) { //перебираем весь массив и печатаем его в столбик
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
