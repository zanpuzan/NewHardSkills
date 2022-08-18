package by.vzanevsky.exception;

import java.util.Scanner;

public class User {

    protected String[] fullName;
    protected int age;

    protected void scanName() {
        System.out.print("������� �.�.�: ");
        Scanner sc = new Scanner(System.in);
        String[] fullName = (sc.nextLine().trim()).split("\\s+");
        if (fullName.length != 3) {
            throw new RuntimeException("�������� ������!");
        } else {
            this.fullName = fullName;
        }
    }

    protected void scanAge() {
        System.out.print("������� �������: ");
        Scanner sc = new Scanner(System.in);
        try {
            this.age = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException ex) {
            System.out.println("�������� ��������!");
            scanAge();
        }

        if (this.age <= 0 | this.age >= 100) {
            throw new RuntimeException("������ �������� �� ������!");
        }
    }
}
