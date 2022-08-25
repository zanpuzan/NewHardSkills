package by.vzanevsky.multithreading;

import java.util.Scanner;

public class User {

    Scanner sc = new Scanner(System.in);

    protected boolean choice;

    public boolean isChoice() {
        return choice;
    }

    protected void scanChoice () {
        System.out.print("Введите ответ: ");
        String choice = sc.nextLine().trim();
        if (choice.equalsIgnoreCase("Да")) {
            this.choice = true;
        } else if (choice.equalsIgnoreCase("Нет")) {
            this.choice = false;
        } else {
            System.out.println("Некорректный ответ! Отвечать да или нет!");
            scanChoice();

        }
    }

}
