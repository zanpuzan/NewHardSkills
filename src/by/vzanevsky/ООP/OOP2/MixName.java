package by.vzanevsky.��P.OOP2;

import java.util.Arrays;
import java.util.Locale;

public class MixName {

    protected String name;
    protected String color;
    protected String fins;
    protected String habitat;

    User user = new User();

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFins(String fins) {
        this.fins = fins;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    protected void questionOne() {
        System.out.println("������� ���� ����:");
        System.out.print(" 1. ����� \n 2. ������� \n 3. ������� \n");
        user.scan();
        switch (user.answer) {
            case 1 -> setColor("�����");
            case 2 -> setColor("�������");
            case 3 -> setColor("�������");
        }
    }

    protected void questionTwo() {
        System.out.println("������� ���������� ���������:");
        System.out.print(" 1. ������ \n 2. ����� \n 3. ������ \n");
        user.scan();
        switch (user.answer) {
            case 1 -> setFins("������");
            case 2 -> setFins("�����");
            case 3 -> setFins("������");
        }
    }

    protected void questionThree() {
        System.out.println("������� ����� ��������:");
        System.out.print(" 1. ���� \n 2. ����� \n 3. ���� \n");
        user.scan();
        switch (user.answer) {
            case 1 -> setHabitat("����");
            case 2 -> setHabitat("�����");
            case 3 -> setHabitat("����");
        }
    }

    protected void createName () {

        char [] array1 = new char[3];
        this.habitat.getChars(0,3, array1, 0);
        String str1 =  new String(array1);

        char [] array2 = new char[3];
        this.fins.getChars(0,3, array2, 0);
        String str2 =  new String(array2);

        char [] array3 = new char[3];
        this.color.getChars(0,3, array3, 0);
        String str3 =  new String(array3);

        String str4 = String.join("",str1 + str2 + str3);
        setName(str4);
    }
}
