package by.vzanevsky.��P.polymorpf;

import java.util.Scanner;

public class User {

    protected boolean choice;

    void scanChoice() {
        Scanner sc = new Scanner(System.in);
        setChoice(sc.nextLine().trim());
    }

    protected void signalQuest() {
        System.out.print("������� ������ ����� ������� ������ ���������? \n�������� �� ��� ���: ");
        scanChoice();
    }

    public void setChoice(String choice) {
        if (choice.equalsIgnoreCase("��")) {
            this.choice = true;
        } else if (choice.equalsIgnoreCase("���")) {
            this.choice = false;
        } else {
            System.out.print("������������ �����! \n�������� �� ��� ���:");
            scanChoice();
        }
    }
}