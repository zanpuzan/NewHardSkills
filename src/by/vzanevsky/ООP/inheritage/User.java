package by.vzanevsky.ООP.inheritage;

import java.util.Scanner;

public class User {
    protected int answer;
    protected boolean choice;

    public int scan() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ведите номер продукта: ");

        if (sc.hasNextInt()) {
            this.answer = sc.nextInt();
        } else {
            System.out.println("Некорректный вариант ответа!");
            return scan();
        }

        if (this.answer > 0 & this.answer < 8) {
            return this.answer;
        } else {
            System.out.println("Некорректный ваниант ответа!");
            return scan();
        }
    }

    void scanChoice() {
        Scanner sc = new Scanner(System.in);
        setChoice(sc.nextLine().trim());
    }

    public void setChoice(String choice) {
        if (choice.equalsIgnoreCase("Да")) {
            this.choice = true;
        } else if (choice.equalsIgnoreCase("Нет")) {
            this.choice = false;
        } else {
            System.out.print("Некорректный ответ! \nПопробуйте еще :");
            scanChoice();
        }
    }

    protected void firstQuest () {
        System.out.print("Хотите выбрать продукт? \nОтвечать да или нет :");
        scanChoice();
    }
}
