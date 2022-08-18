package by.vzanevsky.ООP.OOP2;

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
        System.out.println("Задайте цвет рыбы:");
        System.out.print(" 1. Синий \n 2. Зеленый \n 3. Красный \n");
        user.scan();
        switch (user.answer) {
            case 1 -> setColor("синий");
            case 2 -> setColor("зеленый");
            case 3 -> setColor("красный");
        }
    }

    protected void questionTwo() {
        System.out.println("Задайте количество плавников:");
        System.out.print(" 1. Четыре \n 2. Шесть \n 3. Восемь \n");
        user.scan();
        switch (user.answer) {
            case 1 -> setFins("четыре");
            case 2 -> setFins("шесть");
            case 3 -> setFins("восемь");
        }
    }

    protected void questionThree() {
        System.out.println("Задайте среду обитания:");
        System.out.print(" 1. Море \n 2. Озеро \n 3. Река \n");
        user.scan();
        switch (user.answer) {
            case 1 -> setHabitat("море");
            case 2 -> setHabitat("озеро");
            case 3 -> setHabitat("река");
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
