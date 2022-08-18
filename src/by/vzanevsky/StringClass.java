package by.vzanevsky;

import java.util.Arrays;
import java.util.Locale;

public class StringClass {
    public static void main(String[] args) {

        String str1 = "New Hard Skills";

        System.out.println("Определение длинны заданной строки: " + str1);
        System.out.println("Длинная заданной строки: " + str1.length() + " символов");

        System.out.println("Проверка строки:");

        if (str1.isEmpty()) {
            System.out.println("Строка пустая");
        } else {
            System.out.println("Строка не пустая");
        }

        System.out.println("Позиция позция в строке символа N : " + str1.indexOf('N'));
        System.out.println("Позиция позция в строке символа H : " + str1.indexOf('H'));
        System.out.println("Позиция позция в строке символа S : " + str1.indexOf('S'));

        char char1 = str1.charAt(0);
        char char2 = str1.charAt(4);
        char char3 = str1.charAt(9);

        System.out.println("Извлечение символов из строки методом charAt : " + char1 + char2 + char3);

        char [] array1 = new char[4];
        str1.getChars(4,8, array1, 0);
        String str9 =  new String(array1);

        System.out.println("Извлечение слова из строки методом getChars : " + str9);

        String str2 = new String(new char [] {'N','H','S'});

        System.out.println("Перевод в нижний регистр заднной строки: " + str2);

        String lowStr2 = str2.toLowerCase();

        System.out.println("Результат: " + lowStr2);
        System.out.println("Сравнение строк NHS и nhs методом equals : " + str2.equals(lowStr2));
        System.out.println("Сравнение строк NHS и nhs методом equalsIsIgnoreCase : " + str2.equalsIgnoreCase(lowStr2));

        String str3 = "New";
        String str4 = "Hard";
        String str5 = "Skills";

        String str6 = str3.concat(str4);
        String str7 = str6.concat(str5);

        System.out.println("Объединение трех строк методом concat : " + str7);

        String str8 = String.join(" ", str3, str4, str5);

        System.out.println("Объединение трех строк методом join : " + str8);

        String repStr1 = str8.replace('S', '$');
        String repStr2 = str8.replace("Hard", "String");

        System.out.println("Замена символов в строке методом replace : "  + repStr1);
        System.out.println("Замена слова в строке методом replace : "  + repStr2);

        String str10 = "          New Hard Skills            ";

        System.out.println("Заданная строка: " + str10);

        str10 = str10.trim();

        System.out.println("Обрезка начальных и конечных пробелов методом trim : " + str10);
    }
}
