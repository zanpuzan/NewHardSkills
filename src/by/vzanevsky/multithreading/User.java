package by.vzanevsky.multithreading;

import java.util.Scanner;

public class User {

    Scanner sc = new Scanner(System.in);

    protected boolean choice;

    public boolean isChoice() {
        return choice;
    }

    protected void scanChoice () {
        System.out.print("������� �����: ");
        String choice = sc.nextLine().trim();
        if (choice.equalsIgnoreCase("��")) {
            this.choice = true;
        } else if (choice.equalsIgnoreCase("���")) {
            this.choice = false;
        } else {
            System.out.println("������������ �����! �������� �� ��� ���!");
            scanChoice();

        }
    }

}
