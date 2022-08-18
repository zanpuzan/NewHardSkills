package by.vzanevsky.ООP.polymorpf;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        Transport ground = new Ground();
        Transport air = new Air();
        Transport water = new Water();
        Transport underground = new Underground();

        System.out.println("Здравствуйте!");

        user.signalQuest();

        if (user.choice) {
            Transport[] mas = {ground, air, water, underground};
            for (Transport object : mas) {
                object.honk();
            }
        }

        System.out.println("До свидания!");

    }
}
