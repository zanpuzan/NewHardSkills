package by.vzanevsky;

public class Operations {
    public static void main(String[] args) {

        int int1 = -2;
        int int2 = 5;
        double double1 = 2.6;
        double double2 = -0.2;
        String string1 = "��������� ��������� = ";

        //�������� ������������� ����������
        int intResult1 = int1 + int2;
        System.out.println(string1 + intResult1);
        int intResult2 = int2 + int1;
        System.out.println(string1 + intResult2);

        //��������� ������������� ����������
        int intResult3 = int1 - int2;
        System.out.println(string1 + intResult3);
        int intResult4 = int2 - int1;
        System.out.println(string1 + intResult4);

        //��������� ������������� ����������
        int intResult5 = int1 * 7;
        System.out.println(string1 + intResult5);
        int intResult6 = int2 * 3;
        System.out.println(string1 + intResult6);

        //������� ������������� ����������
        int intResult7 = 10 / int1;
        System.out.println(string1 + intResult7);
        int intResult8 = 40 / int2;
        System.out.println(string1 + intResult8);

        //�������� ���������� c ��������� �������
        double doubleResult1 = double1 + double2;
        System.out.println(string1 + doubleResult1);
        double doubleResult2 = double2 + double1;
        System.out.println(string1 + doubleResult2);

        //��������� ���������� c ��������� �������
        double doubleResult3 = double1 - double2;
        System.out.println(string1 + doubleResult3);
        double doubleResult4 = double2 - double1;
        System.out.println(string1 + doubleResult4);

        //��������� ���������� c ��������� �������
        double doubleResult5 = double1 * double2;
        System.out.println(string1 + doubleResult5);
        double doubleResult6 = double2 * double1;
        System.out.println(string1 + doubleResult6);

        //������� ���������� c ��������� �������
        double doubleResult7 = double1 / double2;
        System.out.println(string1 + doubleResult7);
        double doubleResult8 = double2 / double1;
        System.out.println(string1 + doubleResult8);

        //�������� ���������� ������ �����
        double doubleResult9 = int1 + double2;
        System.out.println(string1 + doubleResult9);
        double doubleResult10 = int2 + double1;
        System.out.println(string1 + doubleResult10);

        //��������� ���������� ������ �����
        double doubleResult11 = double1 - int1;
        System.out.println(string1 + doubleResult11);
        double doubleResult12 = double2 - int2;
        System.out.println(string1 + doubleResult12);

        //��������� ���������� ������ �����
        double doubleResult13 = double1 * int2;
        System.out.println(string1 + doubleResult13);
        double doubleResult14 = int1 * double2;
        System.out.println(string1 + doubleResult14);

        //������� ���������� ������ �����
        double doubleResult15 = double1 / int1;
        System.out.println(string1 + doubleResult15);
        double doubleResult16 = int2 / double2;
        System.out.println(string1 + doubleResult16);

        //������� �� �������
        int intResult9 = int2 % int1;
        System.out.println(string1 + intResult9);
        double doubleResult17 = double1 % int1;
        System.out.println(string1 + doubleResult17);
        int specialResult1 = 19 / int2;
        int specialResult2 = 19 % int2;
        System.out.println(string1 + specialResult1 + " ������� = " + specialResult2);

        //����������� ���������
        int intResult10 = int1 + int2++;
        System.out.println(string1 + intResult10);
        double doubleResult18 = int2 - double2;
        System.out.println(string1 + doubleResult18);

        //���������� ���������
        int intResult11 = ++int2 + int1;
        System.out.println(string1 + intResult11);
        double doubleResult19 = int2 - double1;
        System.out.println(string1 + doubleResult19);

        //����������� ���������
        int intResult12 = int1 + int2--;
        System.out.println(string1 + intResult12);
        double doubleResult20 = int2 - double2;
        System.out.println(string1 + doubleResult20);

        //���������� ���������
        int intResult13 = --int2 + int1;
        System.out.println(string1 + intResult13);
        double doubleResult21 = int2 - double1;
        System.out.println(string1 + doubleResult21);

        //��������� ��������
        int intResult14 = 2 + int2 * 2 + ++int2 - int2;
        System.out.println(string1 + intResult14);
        int intResult15 = 2 - --int2 * 2 + int1 + int2;
        System.out.println(string1 + intResult15);
        double doubleResult22 = int1 * ++double2 + double1 / --double2;
        System.out.println(string1 + doubleResult22);

        //��������� ��������
        boolean bool1 = int1 == int2;
        System.out.println(string1 + bool1);
        boolean bool2 = int2 != int1;
        System.out.println(string1 + bool2);
        boolean bool3 = double1 >= int1;
        System.out.println(string1 + bool3);
        boolean bool4 = int2 <= double2;
        System.out.println(string1 + bool4);

        //���������� "���"
        boolean bool5 = (int1 > int2) || (int2 >= int1);
        System.out.println(string1 + bool5);
        boolean bool6 = (int2 < double2) || (double1 != double1);
        System.out.println(string1 + bool6);

        //���������� "�"
        boolean bool7 = (int1 <= int2) && (double2 > int1);
        System.out.println(string1 + bool7);
        boolean bool8 = (double2 >= int1) && (double1 < 0);
        System.out.println(string1 + bool8);

        //����������� "���", ���������
        boolean bool9 = (int1 <= int2) & (double1 > int2) ^ (6 > 7) || (double1 != 0);
        System.out.println(string1 + bool9);
        boolean bool10 = (double1 != int2) | (int2 == 4) ^ (int1 < double2) & (4 < double1);
        System.out.println(string1 + bool10);

    }
}
