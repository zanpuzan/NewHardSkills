package by.vzanevsky.exception;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        System.out.println("Задача: попытаться сломать программу ввода данных");

        do {
            try {
                user.scanName();
            } catch (RuntimeException re) {
                System.out.println(re.getMessage());
            }
        } while (user.fullName == null);

        System.out.println("Отлично! Идем дальше");

        do {
            try{
                user.scanAge();
            } catch (RuntimeException re) {
                System.out.println(re.getMessage());
            }
        } while (user.age <= 0 | user.age >= 100);

        System.out.println("Спасибо за информацию ._.");
    }
}
