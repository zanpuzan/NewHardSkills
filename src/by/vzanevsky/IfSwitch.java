package by.vzanevsky;

import java.sql.SQLOutput;

public class IfSwitch {

    public static void main(String[] args) {

        //Программа, определяющая день недели по числу

        System.out.println("Программа, определяющая день недели по числу");

        int dayNumb = 7; //Введите номер дня недели
        System.out.println("Введенный номер дня недели " + dayNumb);

        switch (dayNumb) {
            case 1:
                System.out.println("Это понедельник");
                break;
            case 2:
                System.out.println("Это вторник");
                break;
            case 3:
                System.out.println("Это среда");
                break;
            case 4:
                System.out.println("Это четверг");
                break;
            case 5:
                System.out.println("Это пятница");
                break;
            case 6:
                System.out.println("Это суббота");
                break;
            case 7:
                System.out.println("Это воскресенье");
                break;
            default:
                System.out.println("Такого дня не бывает!");

        }

        //Программа, определяющая наибольшее число из трех

        System.out.println("Программа, определяющая наибольшее число из трех");

        double number1 = 3.4;    //Введите число 1
        double number2 = 0.947;  //Введите число 2
        double number3 = -7.6;   //Введите число 3

        System.out.println("Введенное число 1 = " + number1);
        System.out.println("Введенное число 2 = " + number2);
        System.out.println("Введенное число 3 = " + number3);

        double result = number1 > number2 ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);
        System.out.println("Наибольшим числом является = " + result);

        //Программа, определяющая характеристики введенного числа

        System.out.println("Программа, определяющая характеристики введенного числа");

        double double1 = -8.4; //Введите сюда число
        System.out.println("Введенное число " + double1 + " является:");

        int result1 = double1 % 1 == 0 ? 0 : 1;
        if (result1 == 0) {
            System.out.println("-целым");
        } else {
            System.out.println("-рациональным");
        }

        if (double1 > 0) {
            System.out.println("-положительным");
        } else if (double1 < 0) {
            System.out.println("-отрицательным");
        } else {
            System.out.println("-не является положительным либо отрицательным");
        }

        if (result1 == 0 && double1 < 10 & double1>0) {
            System.out.println("-натуральным");
        }
        if (double1 == 0) {
            System.out.println("-является натуральным числом или нет вопрос спорный");
        }

        double whole = (int)double1;
        double fract = double1 - whole;

        if (result1 == 1) {
            System.out.println("Целая часть числа = " + whole);
            System.out.println("Дробная часть числа = " + fract);
        }
    }
}
