package by.vzanevsky.Metodu;

import java.util.Scanner;

public class Count {
    public static int getDay() {

        Scanner sc = new Scanner(System.in);

        System.out.print("������ ����������� ����: ");

        int b;

        if (sc.hasNextInt()) {
            b = sc.nextInt();
        } else {
            System.out.println("������������ ���� ����");
            return getDay();
        }

        if (b > 0) {
            return b;
        } else {
            System.out.println("������������ ���� ����");
            return getDay();
        }
    }

    public static int getMonth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("������ ����������� �ec��: ");

        int b;

        if (sc.hasNextInt()) {
            b = sc.nextInt();
        } else {
            System.out.println("������������ ���� ����");
            return getMonth();
        }

        if (b > 0) {
            return b;
        } else {
            System.out.println("������������ ���� ����");
            return getMonth();
        }
    }

    public int dayMonth(int a) {

        int b;

        switch (a) {
            case 1:
                b = 0;
                break;
            case 2:
                b = 31;
                break;
            case 3:
                b = 59;
                break;
            case 4:
                b = 90;
                break;
            case 5:
                b = 120;
                break;
            case 6:
                b = 151;
                break;
            case 7:
                b = 181;
                break;
            case 8:
                b = 212;
                break;
            case 9:
                b = 243;
                break;
            case 10:
                b = 273;
                break;
            case 11:
                b = 304;
                break;
            case 12:
                b = 334;
                break;
            default :
                b = 0;
        }
        return b;
    }

    void dayCount(int a, int b) {

        System.out.print("���������� ���� �� ������ ����: ");

        System.out.println(365 - (dayMonth(b) + a));

        System.out.println("�����������!");

    }
}
