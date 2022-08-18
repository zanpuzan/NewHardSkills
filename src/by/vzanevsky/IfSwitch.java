package by.vzanevsky;

import java.sql.SQLOutput;

public class IfSwitch {

    public static void main(String[] args) {

        //���������, ������������ ���� ������ �� �����

        System.out.println("���������, ������������ ���� ������ �� �����");

        int dayNumb = 7; //������� ����� ��� ������
        System.out.println("��������� ����� ��� ������ " + dayNumb);

        switch (dayNumb) {
            case 1:
                System.out.println("��� �����������");
                break;
            case 2:
                System.out.println("��� �������");
                break;
            case 3:
                System.out.println("��� �����");
                break;
            case 4:
                System.out.println("��� �������");
                break;
            case 5:
                System.out.println("��� �������");
                break;
            case 6:
                System.out.println("��� �������");
                break;
            case 7:
                System.out.println("��� �����������");
                break;
            default:
                System.out.println("������ ��� �� ������!");

        }

        //���������, ������������ ���������� ����� �� ����

        System.out.println("���������, ������������ ���������� ����� �� ����");

        double number1 = 3.4;    //������� ����� 1
        double number2 = 0.947;  //������� ����� 2
        double number3 = -7.6;   //������� ����� 3

        System.out.println("��������� ����� 1 = " + number1);
        System.out.println("��������� ����� 2 = " + number2);
        System.out.println("��������� ����� 3 = " + number3);

        double result = number1 > number2 ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);
        System.out.println("���������� ������ �������� = " + result);

        //���������, ������������ �������������� ���������� �����

        System.out.println("���������, ������������ �������������� ���������� �����");

        double double1 = -8.4; //������� ���� �����
        System.out.println("��������� ����� " + double1 + " ��������:");

        int result1 = double1 % 1 == 0 ? 0 : 1;
        if (result1 == 0) {
            System.out.println("-�����");
        } else {
            System.out.println("-������������");
        }

        if (double1 > 0) {
            System.out.println("-�������������");
        } else if (double1 < 0) {
            System.out.println("-�������������");
        } else {
            System.out.println("-�� �������� ������������� ���� �������������");
        }

        if (result1 == 0 && double1 < 10 & double1>0) {
            System.out.println("-�����������");
        }
        if (double1 == 0) {
            System.out.println("-�������� ����������� ������ ��� ��� ������ �������");
        }

        double whole = (int)double1;
        double fract = double1 - whole;

        if (result1 == 1) {
            System.out.println("����� ����� ����� = " + whole);
            System.out.println("������� ����� ����� = " + fract);
        }
    }
}
