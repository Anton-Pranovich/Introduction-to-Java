package algorithmization.araysOfArays;

/**
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
 * элемент больше последнего.
 */
public class Task1 {
    public static void main(String[] args) {
        int[][] array = {{4, 2, 3}, {2, 3, 4}, {3, 4, 4}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j += 2) {
                if (array[array.length - 1][j] < array[0][j]) {
                    System.out.print(array[i][j] + "\t"); //печатаем нужный нам столбик
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) { //перебираем весь массив и печатаем его в столбик
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

