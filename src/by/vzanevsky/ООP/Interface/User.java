package by.vzanevsky.��P.Interface;

import java.util.Scanner;

class User {

    protected boolean choice;
    protected String name;

    void scanChoice() {
        Scanner sc = new Scanner(System.in);
        setChoice(sc.nextLine().trim());
    }

    void scanName() {
        System.out.print("������� ���: ");
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

    protected void infoQuest() {
        System.out.print("������� ������ ���������� � ����������? \n�������� �� ��� ���: ");
        scanChoice();
    }

    protected void smokeQuest() {
        System.out.print("��������� �������? \n�������� �� ��� ���: ");
        scanChoice();
    }

    protected void menuQuest() {
        System.out.print("������ ����� �����. ������� ���������� ����? \n�������� �� ��� ���: ");
        scanChoice();
    }

    protected void lunchQuest() {
        System.out.print("��� ���������� ����? \n�������� �� ��� ���: ");
        scanChoice();
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }
}
