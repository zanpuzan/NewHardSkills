package by.vzanevsky.streamInOut;

import java.util.Scanner;

public class User {

    protected String fullName;
    protected String age;

    protected void scanName() {
        System.out.print("Введите Ф.И.О: ");
        Scanner sc = new Scanner(System.in);
        String[] fullName = (sc.nextLine().trim()).split("\\s+");
        if (fullName.length != 3) {
            throw new RuntimeException("Неверный формат!");
        } else {
            this.fullName = "Ваше имя: " + String.join(" ", fullName);
        }
    }

    protected void scanAge() {
        int age = 0;
        do {
            System.out.print("Введите возраст: ");
            Scanner sc = new Scanner(System.in);
            try {
                 age = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException ex) {
                 System.out.println("Неверное значение!");
            }
        } while (age == 0);

        if (age <= 0 | age >= 100) {
            throw new RuntimeException("Такого возраста не бывает!");
        } else {
            this.age = "Выш возраст: " + age;
        }
    }
}
