package by.vzanevsky.ООP.objectAsParameter;

import java.util.Scanner;

public class User {

    protected int answer;
    protected boolean choice;
    protected String name;

    void scanChoice() {
        Scanner sc = new Scanner(System.in);
        setChoice(sc.nextLine().trim());
    }

    void scanAnswer() {
        Scanner sc = new Scanner(System.in);
        setAnswer(sc.nextLine().trim());
    }

    void scanName() {
        System.out.print("Введите название: ");
        Scanner sc = new Scanner(System.in);
        setName(sc.nextLine().trim());
    }

    public void setChoice(String choice) {
        if (choice.equalsIgnoreCase("Да")) {
            this.choice = true;
        } else if (choice.equalsIgnoreCase("Нет")) {
            this.choice = false;
        } else {
            System.out.print("Некорректный ответ! \nОтвечать да или нет: ");
            scanChoice();
        }
    }

    protected void setAnswer(String answer) {
        if (answer.equalsIgnoreCase("Наземный")) {
            this.answer = 1;
        } else if (answer.equalsIgnoreCase("Воздушный")) {
            this.answer = 2;
        } else if (answer.equalsIgnoreCase("Водный")) {
            this.answer = 3;
        } else if (answer.equalsIgnoreCase("Подземный")) {
            this.answer = 4;
        } else {
            System.out.print("Некорректный ответ! \nВведите вариант из списка: ");
            scanAnswer();
        }
    }

    protected void firstQuest() {
        System.out.print("Желаете создать новый транспорт? \nОтвечать да или нет: ");
        scanChoice();
    }

    protected void kindQuest() {
        System.out.println("Выберите вид транспорта:");
        System.out.printf(" - %1$s \n - %2$s \n - %3$s \n - %4$s \n", Ground.kind, Air.kind, Water.kind, Underground.kind);
        System.out.print("Введите вариант из списка: ");
        scanAnswer();
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }
}