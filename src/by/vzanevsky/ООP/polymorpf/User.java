package by.vzanevsky.ООP.polymorpf;

import java.util.Scanner;

public class User {

    protected boolean choice;

    void scanChoice() {
        Scanner sc = new Scanner(System.in);
        setChoice(sc.nextLine().trim());
    }

    protected void signalQuest() {
        System.out.print("Желаете узнать какие сигналы издает транспорт? \nОтвечать да или нет: ");
        scanChoice();
    }

    public void setChoice(String choice) {
        if (choice.equalsIgnoreCase("Да")) {
            this.choice = true;
        } else if (choice.equalsIgnoreCase("Нет")) {
            this.choice = false;
        } else {
            System.out.print("Некорректный ответ! \nОтвечать да или нет:");
            scanChoice();
        }
    }
}