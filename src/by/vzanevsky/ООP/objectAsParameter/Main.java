package by.vzanevsky.ООP.objectAsParameter;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        Transport ground = new Ground();
        Transport air = new Air();
        Transport water = new Water();
        Transport underground = new Underground();

        System.out.println("Приветствую!");

        user.firstQuest();

        while (user.choice) {

            user.kindQuest();
            switch (user.answer) {
                case 1:
                    createGround(ground);
                    break;
                case 2:
                    createAir(air);
                    break;
                case 3:
                    createWater(water);
                    break;
                case 4:
                    createUnderground(underground);
                    break;
            }

            user.choice = false;
            user.firstQuest();
        }

        System.out.println("До свидания!");
    }

    static void createGround (Transport transport) {
        User user = new User();
        user.scanName();
        transport = new Ground(user.getName());
        transport.info();
    }

    static void createAir (Transport transport) {
        User user = new User();
        user.scanName();
        transport = new Air(user.getName());
        transport.info();
    }

    static void createWater (Transport transport) {
        User user = new User();
        user.scanName();
        transport = new Water(user.getName());
        transport.info();
    }

    static void createUnderground (Transport transport) {
        User user = new User();
        user.scanName();
        transport = new Underground(user.getName());
        transport.info();
    }
}
