package by.vzanevsky.ООP.ObjectConstuctor;

import java.util.Scanner;

public class User {

    public int answer;
    public String firstName;
    public String lastName;

    public int scan() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ведите вариант ответа: ");

        if (sc.hasNextInt()) {
            this.answer = sc.nextInt();
        } else {
            System.out.println("Некорректный вариант ответа");
            return scan();
        }

        if (this.answer > 0 & this.answer < 4) {
            return this.answer;
        } else {
            System.out.println("Некорректный ваниант ответа");
            return scan();
        }
    }
    void firstName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведите ваше имя: ");
        this.firstName = sc.nextLine();
        }
    void lastName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведите вашу фамилию: ");
        this.lastName = sc.nextLine();
    }

}
