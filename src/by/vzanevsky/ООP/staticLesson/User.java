package by.vzanevsky.��P.staticLesson;

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
        System.out.print("������� ��������: ");
        Scanner sc = new Scanner(System.in);
        setName(sc.nextLine().trim());
    }

    public void setChoice(String choice) {
        if (choice.equalsIgnoreCase("��")) {
            this.choice = true;
        } else if (choice.equalsIgnoreCase("���")) {
            this.choice = false;
        } else {
            System.out.print("������������ �����! \n�������� �� ��� ���: ");
            scanChoice();
        }
    }

    protected void setAnswer(String answer) {
        if (answer.equalsIgnoreCase("��������")) {
            this.answer = 1;
        } else if (answer.equalsIgnoreCase("���������")) {
            this.answer = 2;
        } else if (answer.equalsIgnoreCase("������")) {
            this.answer = 3;
        } else if (answer.equalsIgnoreCase("���������")) {
            this.answer = 4;
        } else {
            System.out.print("������������ �����! \n������� ������� �� ������: ");
            scanAnswer();
        }
    }

    protected void firstQuest() {
        System.out.print("������� ������� ����� ���������? \n�������� �� ��� ���: ");
        scanChoice();
    }

    protected void kindQuest() {
        System.out.println("�������� ��� ����������:");
        System.out.printf(" - %1$s \n - %2$s \n - %3$s \n - %4$s \n", Ground.kind, Air.kind, Water.kind, Underground.kind);
        System.out.print("������� ������� �� ������: ");
        scanAnswer();
    }

    protected void countQuest() {
        System.out.print("������� ������ ���������� ���������� ����������? \n�������� �� ��� ���: ");
        scanChoice();
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }
}
