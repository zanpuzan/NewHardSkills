package by.vzanevsky;

import java.util.Arrays;

public class ArraysWork {
    public static void main(String[] args) {

        System.out.println("Задание 1: вывести числа из заданного одномерного массива");

        int [] mas1 = {23, 45, 56, -54, 4, 17, 57, 78, 33, 1, 78, 0, 77, 456, -45546, 87, 11, 48, -92, 100};

        System.out.print("Заданный массив: ");
        System.out.println(Arrays.toString(mas1));

        int value1 = mas1.length;
        int value2 = mas1[mas1.length-1];

        System.out.println("Длинна заданного массива: " + value1);
        System.out.println("Последний индекс равен: " + value2);
        System.out.print("Четные числа массива: ");

        for (int i : mas1) {
            if (i % 2 == 0 & i != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.print("Нечетные числа массива: ");

        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 != 0) {
                System.out.print(mas1[i] + " ");
            }
        }

        System.out.println();

        System.out.println("Задание 2: заменить числа массива на 0");

        int [][] mas2 = {{-1, 26, 358, 715, -349, 321, 999, 652, 16, -13}, {44, -13, -49, 56, 216, -6573, 86, 88, 24, 717}};

        System.out.print("Заданный массив: ");
        System.out.print(Arrays.deepToString(mas2));

        System.out.println();

        int value3 = mas2.length;
        int value4 = mas2[0].length;

        System.out.println("Число строк заданного массива: " + value3);
        System.out.println("Число столбцов заданного массива: " + value4);

        System.out.println("Замена на 0 нечетных чисел:");

        for (int i = 0; i < mas2.length; i++) {
            for (int j = 0; j < mas2[i].length; j++) {
                if (mas2[i][j] % 2 != 0) {
                    mas2[i][j] = 0;
                }
                System.out.print(mas2[i][j] + " ");
            }
            System.out.println();
        }








    }
}
