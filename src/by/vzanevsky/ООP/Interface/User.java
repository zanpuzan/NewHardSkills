package by.vzanevsky.ООP.Interface;

import java.util.Scanner;

class User {

    protected boolean choice;
    protected String name;

    void scanChoice() {
        Scanner sc = new Scanner(System.in);
        setChoice(sc.nextLine().trim());
    }

    void scanName() {
        System.out.print("введите имя: ");
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

    protected void infoQuest() {
        System.out.print("Желаете узнать информацию о работниках? \nОтвечать да или нет: ");
        scanChoice();
    }

    protected void smokeQuest() {
        System.out.print("Разрешить перекур? \nОтвечать да или нет: ");
        scanChoice();
    }

    protected void menuQuest() {
        System.out.print("Пришло время обеда. Желаете посмотреть меню? \nОтвечать да или нет: ");
        scanChoice();
    }

    protected void lunchQuest() {
        System.out.print("Вам понравился обед? \nОтвечать да или нет: ");
        scanChoice();
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }
}
