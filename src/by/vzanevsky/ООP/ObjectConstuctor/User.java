package by.vzanevsky.��P.ObjectConstuctor;

import java.util.Scanner;

public class User {

    public int answer;
    public String firstName;
    public String lastName;

    public int scan() {

        Scanner sc = new Scanner(System.in);

        System.out.print("������ ������� ������: ");

        if (sc.hasNextInt()) {
            this.answer = sc.nextInt();
        } else {
            System.out.println("������������ ������� ������");
            return scan();
        }

        if (this.answer > 0 & this.answer < 4) {
            return this.answer;
        } else {
            System.out.println("������������ ������� ������");
            return scan();
        }
    }
    void firstName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("������ ���� ���: ");
        this.firstName = sc.nextLine();
        }
    void lastName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("������ ���� �������: ");
        this.lastName = sc.nextLine();
    }

}
