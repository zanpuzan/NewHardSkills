package by.vzanevsky.ООP.abstractClass;

import java.util.Scanner;

public class User {

    protected int answer;
    protected boolean choice;

    void scanChoice() {
        Scanner sc = new Scanner(System.in);
        setChoice(sc.nextLine().trim());
    }

    void scanAnswer() {
        Scanner sc = new Scanner(System.in);
        setAnswer(sc.nextLine().trim());
    }

    protected void choiceQuest() {
        System.out.print("Желаете выбрать тругой транспорт? \nОтвечать да или нет :");
        scanChoice();
    }

    protected void signalQuest() {
        System.out.print("Нажать на гудок? \nОтвечать да или нет :");
        scanChoice();
    }

    public void setChoice(String choice) {
        if (choice.equalsIgnoreCase("Да")) {
            this.choice = true;
        } else if (choice.equalsIgnoreCase("Нет")) {
            this.choice = false;
        } else {
            System.out.print("Некорректный ответ! \nОтвечать да или нет :");
            scanChoice();
        }
    }

    protected void setAnswer(String choice) {
        if (choice.equalsIgnoreCase("Автомобиль")) {
            this.answer = 1;
        } else if (choice.equalsIgnoreCase("Мотоцикл")) {
            this.answer = 2;
        } else if (choice.equalsIgnoreCase("Самолет")) {
            this.answer = 3;
        } else if (choice.equalsIgnoreCase("Воздушный шар")) {
            this.answer = 4;
        } else if (choice.equalsIgnoreCase("Корабль")) {
            this.answer = 5;
        } else if (choice.equalsIgnoreCase("Паром")) {
            this.answer = 6;
        } else if (choice.equalsIgnoreCase("Метро")) {
            this.answer = 7;
        } else {
            System.out.print("Некорректный ответ! \nВведите транспорт из списка :");
            scanAnswer();
        }
    }


}
