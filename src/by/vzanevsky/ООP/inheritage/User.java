package by.vzanevsky.��P.inheritage;

import java.util.Scanner;

public class User {
    protected int answer;
    protected boolean choice;

    public int scan() {

        Scanner sc = new Scanner(System.in);

        System.out.print("������ ����� ��������: ");

        if (sc.hasNextInt()) {
            this.answer = sc.nextInt();
        } else {
            System.out.println("������������ ������� ������!");
            return scan();
        }

        if (this.answer > 0 & this.answer < 8) {
            return this.answer;
        } else {
            System.out.println("������������ ������� ������!");
            return scan();
        }
    }

    void scanChoice() {
        Scanner sc = new Scanner(System.in);
        setChoice(sc.nextLine().trim());
    }

    public void setChoice(String choice) {
        if (choice.equalsIgnoreCase("��")) {
            this.choice = true;
        } else if (choice.equalsIgnoreCase("���")) {
            this.choice = false;
        } else {
            System.out.print("������������ �����! \n���������� ��� :");
            scanChoice();
        }
    }

    protected void firstQuest () {
        System.out.print("������ ������� �������? \n�������� �� ��� ��� :");
        scanChoice();
    }
}
