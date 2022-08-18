package by.vzanevsky.��P.abstractClass;

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
        System.out.print("������� ������� ������ ���������? \n�������� �� ��� ��� :");
        scanChoice();
    }

    protected void signalQuest() {
        System.out.print("������ �� �����? \n�������� �� ��� ��� :");
        scanChoice();
    }

    public void setChoice(String choice) {
        if (choice.equalsIgnoreCase("��")) {
            this.choice = true;
        } else if (choice.equalsIgnoreCase("���")) {
            this.choice = false;
        } else {
            System.out.print("������������ �����! \n�������� �� ��� ��� :");
            scanChoice();
        }
    }

    protected void setAnswer(String choice) {
        if (choice.equalsIgnoreCase("����������")) {
            this.answer = 1;
        } else if (choice.equalsIgnoreCase("��������")) {
            this.answer = 2;
        } else if (choice.equalsIgnoreCase("�������")) {
            this.answer = 3;
        } else if (choice.equalsIgnoreCase("��������� ���")) {
            this.answer = 4;
        } else if (choice.equalsIgnoreCase("�������")) {
            this.answer = 5;
        } else if (choice.equalsIgnoreCase("�����")) {
            this.answer = 6;
        } else if (choice.equalsIgnoreCase("�����")) {
            this.answer = 7;
        } else {
            System.out.print("������������ �����! \n������� ��������� �� ������ :");
            scanAnswer();
        }
    }


}
