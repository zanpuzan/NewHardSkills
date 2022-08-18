package by.vzanevsky;

import java.util.Arrays;
import java.util.Locale;

public class StringClass {
    public static void main(String[] args) {

        String str1 = "New Hard Skills";

        System.out.println("����������� ������ �������� ������: " + str1);
        System.out.println("������� �������� ������: " + str1.length() + " ��������");

        System.out.println("�������� ������:");

        if (str1.isEmpty()) {
            System.out.println("������ ������");
        } else {
            System.out.println("������ �� ������");
        }

        System.out.println("������� ������ � ������ ������� N : " + str1.indexOf('N'));
        System.out.println("������� ������ � ������ ������� H : " + str1.indexOf('H'));
        System.out.println("������� ������ � ������ ������� S : " + str1.indexOf('S'));

        char char1 = str1.charAt(0);
        char char2 = str1.charAt(4);
        char char3 = str1.charAt(9);

        System.out.println("���������� �������� �� ������ ������� charAt : " + char1 + char2 + char3);

        char [] array1 = new char[4];
        str1.getChars(4,8, array1, 0);
        String str9 =  new String(array1);

        System.out.println("���������� ����� �� ������ ������� getChars : " + str9);

        String str2 = new String(new char [] {'N','H','S'});

        System.out.println("������� � ������ ������� ������� ������: " + str2);

        String lowStr2 = str2.toLowerCase();

        System.out.println("���������: " + lowStr2);
        System.out.println("��������� ����� NHS � nhs ������� equals : " + str2.equals(lowStr2));
        System.out.println("��������� ����� NHS � nhs ������� equalsIsIgnoreCase : " + str2.equalsIgnoreCase(lowStr2));

        String str3 = "New";
        String str4 = "Hard";
        String str5 = "Skills";

        String str6 = str3.concat(str4);
        String str7 = str6.concat(str5);

        System.out.println("����������� ���� ����� ������� concat : " + str7);

        String str8 = String.join(" ", str3, str4, str5);

        System.out.println("����������� ���� ����� ������� join : " + str8);

        String repStr1 = str8.replace('S', '$');
        String repStr2 = str8.replace("Hard", "String");

        System.out.println("������ �������� � ������ ������� replace : "  + repStr1);
        System.out.println("������ ����� � ������ ������� replace : "  + repStr2);

        String str10 = "          New Hard Skills            ";

        System.out.println("�������� ������: " + str10);

        str10 = str10.trim();

        System.out.println("������� ��������� � �������� �������� ������� trim : " + str10);
    }
}
