package by.vzanevsky;

public class Operations {
    public static void main(String[] args) {

        int int1 = -2;
        int int2 = 5;
        double double1 = 2.6;
        double double2 = -0.2;
        String string1 = "Результат выражения = ";

        //Сложение целочисленных переменных
        int intResult1 = int1 + int2;
        System.out.println(string1 + intResult1);
        int intResult2 = int2 + int1;
        System.out.println(string1 + intResult2);

        //Вычитание целочисленных переменных
        int intResult3 = int1 - int2;
        System.out.println(string1 + intResult3);
        int intResult4 = int2 - int1;
        System.out.println(string1 + intResult4);

        //Умножение целочисленных переменных
        int intResult5 = int1 * 7;
        System.out.println(string1 + intResult5);
        int intResult6 = int2 * 3;
        System.out.println(string1 + intResult6);

        //Деление целочисленных переменных
        int intResult7 = 10 / int1;
        System.out.println(string1 + intResult7);
        int intResult8 = 40 / int2;
        System.out.println(string1 + intResult8);

        //Сложение переменных c плавающей запятой
        double doubleResult1 = double1 + double2;
        System.out.println(string1 + doubleResult1);
        double doubleResult2 = double2 + double1;
        System.out.println(string1 + doubleResult2);

        //Вычитание переменных c плавающей запятой
        double doubleResult3 = double1 - double2;
        System.out.println(string1 + doubleResult3);
        double doubleResult4 = double2 - double1;
        System.out.println(string1 + doubleResult4);

        //Умножение переменных c плавающей запятой
        double doubleResult5 = double1 * double2;
        System.out.println(string1 + doubleResult5);
        double doubleResult6 = double2 * double1;
        System.out.println(string1 + doubleResult6);

        //Деление переменных c плавающей запятой
        double doubleResult7 = double1 / double2;
        System.out.println(string1 + doubleResult7);
        double doubleResult8 = double2 / double1;
        System.out.println(string1 + doubleResult8);

        //Сложение переменных разных типов
        double doubleResult9 = int1 + double2;
        System.out.println(string1 + doubleResult9);
        double doubleResult10 = int2 + double1;
        System.out.println(string1 + doubleResult10);

        //Вычитание переменных разных типов
        double doubleResult11 = double1 - int1;
        System.out.println(string1 + doubleResult11);
        double doubleResult12 = double2 - int2;
        System.out.println(string1 + doubleResult12);

        //Умножение переменных разных типов
        double doubleResult13 = double1 * int2;
        System.out.println(string1 + doubleResult13);
        double doubleResult14 = int1 * double2;
        System.out.println(string1 + doubleResult14);

        //Деление переменных разных типов
        double doubleResult15 = double1 / int1;
        System.out.println(string1 + doubleResult15);
        double doubleResult16 = int2 / double2;
        System.out.println(string1 + doubleResult16);

        //Остаток от деления
        int intResult9 = int2 % int1;
        System.out.println(string1 + intResult9);
        double doubleResult17 = double1 % int1;
        System.out.println(string1 + doubleResult17);
        int specialResult1 = 19 / int2;
        int specialResult2 = 19 % int2;
        System.out.println(string1 + specialResult1 + " остаток = " + specialResult2);

        //Постфиксный инкремент
        int intResult10 = int1 + int2++;
        System.out.println(string1 + intResult10);
        double doubleResult18 = int2 - double2;
        System.out.println(string1 + doubleResult18);

        //Префиксный инкремент
        int intResult11 = ++int2 + int1;
        System.out.println(string1 + intResult11);
        double doubleResult19 = int2 - double1;
        System.out.println(string1 + doubleResult19);

        //Постфиксный декремент
        int intResult12 = int1 + int2--;
        System.out.println(string1 + intResult12);
        double doubleResult20 = int2 - double2;
        System.out.println(string1 + doubleResult20);

        //Префиксный декремент
        int intResult13 = --int2 + int1;
        System.out.println(string1 + intResult13);
        double doubleResult21 = int2 - double1;
        System.out.println(string1 + doubleResult21);

        //Приоритет операций
        int intResult14 = 2 + int2 * 2 + ++int2 - int2;
        System.out.println(string1 + intResult14);
        int intResult15 = 2 - --int2 * 2 + int1 + int2;
        System.out.println(string1 + intResult15);
        double doubleResult22 = int1 * ++double2 + double1 / --double2;
        System.out.println(string1 + doubleResult22);

        //Булевские операции
        boolean bool1 = int1 == int2;
        System.out.println(string1 + bool1);
        boolean bool2 = int2 != int1;
        System.out.println(string1 + bool2);
        boolean bool3 = double1 >= int1;
        System.out.println(string1 + bool3);
        boolean bool4 = int2 <= double2;
        System.out.println(string1 + bool4);

        //Логическое "ИЛИ"
        boolean bool5 = (int1 > int2) || (int2 >= int1);
        System.out.println(string1 + bool5);
        boolean bool6 = (int2 < double2) || (double1 != double1);
        System.out.println(string1 + bool6);

        //Логическое "И"
        boolean bool7 = (int1 <= int2) && (double2 > int1);
        System.out.println(string1 + bool7);
        boolean bool8 = (double2 >= int1) && (double1 < 0);
        System.out.println(string1 + bool8);

        //Исключающее "ИЛИ", коньюкция
        boolean bool9 = (int1 <= int2) & (double1 > int2) ^ (6 > 7) || (double1 != 0);
        System.out.println(string1 + bool9);
        boolean bool10 = (double1 != int2) | (int2 == 4) ^ (int1 < double2) & (4 < double1);
        System.out.println(string1 + bool10);

    }
}
