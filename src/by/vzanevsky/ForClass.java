package by.vzanevsky;

public class ForClass {
    public static void main(String[] args) {

        //Вывод нечетных чисел от 1 до 100
        System.out.println("Вывод нечетных чисел от 1 до 100");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1)
                System.out.print(i + "\t");
        }

        System.out.println();

        //Вывод нечетных чисел от 100 до 1
        System.out.println("Вывод нечетных чисел от 100 до 1");

        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 1)
                System.out.print(i + "\t");
        }

        System.out.println();

        //Вывод чисел от 20 до 40
        System.out.println("Вывод чисел от 20 до 40");

        for (int i = 20; i <= 40; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();

        //Вывод чисел от 50 до 80
        System.out.println("Вывод чисел от 50 до 80");

        for (int i = 50; i <= 80; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();

        //Красивый вывод таблицы умножения
        System.out.println("Красивая таблица умножения");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.print(i + " * " + j + " = " + i * j + "\t");
            }
            System.out.println();
        }

        //Вывод заданной последовательности чисел
        System.out.println("Вывод заданной последовательности чисел");

        for (int i = 2; i <= 1024; i = i * 2) {
            System.out.print(i + "\t");
        }

        System.out.println();

        //Вывод чисел кратных семи (до 700)
        System.out.println("Вывод чисел кратных семи (до700)");

        for (int i = 7; i % 7 == 0; i = i + 7) {
            if (i > 700)
                break;
            System.out.print(i + "\t");
        }

        System.out.println();

        //Вывод звездочек (3 строки и 5 колонок)
        System.out.println("Вывод звездочек (3 строки и 5 колонок)");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Картинка из звездочек
        System.out.println("Картинка из звездочек");

        for (int i = 1; i <= 11; i++) {
            for (int j = 1; j <= 23 ; j++) {
                if (((i > 1 & i < 11) & (j == 3 | j == 7 | j == 10 | j == 14)) | ((((i > 1 & i < 7) | i == 10)) & j == 17) | ((i > 5 & i < 10) & j == 21))
                    System.out.print(" * ");
                else if ((i == 5 & j == 4) | (i == 7 & j == 6) | (i == 6 & (j == 5 | (j > 10 & j < 14) | (j > 17 & j < 22))) | (i ==2 | i == 10) & (j > 17 & j < 22))
                    System.out.print(" * ");
                else
                System.out.print("   ");
                continue;
            }
            System.out.println();
        }

    }
}
