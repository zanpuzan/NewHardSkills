package by.vzanevsky.ООP.OOP2;

import java.util.Scanner;

public class User {

    protected int answer;
    protected boolean choice;

    public int scan() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ведите вариант ответа: ");

        if (sc.hasNextInt()) {
            this.answer = sc.nextInt();
        } else {
            System.out.println("Некорректный вариант ответа");
            return scan();
        }

        if (this.answer > 0 & this.answer < 4) {
            return this.answer;
        } else {
            System.out.println("Некорректный ваниант ответа");
            return scan();
        }
    }

    void scanChoice() {
        Scanner sc = new Scanner(System.in);
        setChoice(sc.nextLine());
    }

    public void setChoice(String choice) {
        if (choice.equalsIgnoreCase("Да")) {
            this.choice = true;
        } else if (choice.equalsIgnoreCase("Нет")) {
            this.choice = false;
        } else {
            System.out.print("Некорректный ответ \nПопробуйте еще :");
            scanChoice();
        }
    }

    protected void firstQuest () {
        System.out.print("Хотите создать новую рыбу? \nОтвечать да или нет :");
        scanChoice();
    }
}
