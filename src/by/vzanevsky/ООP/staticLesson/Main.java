package by.vzanevsky.��P.staticLesson;


public class Main {
    public static void main(String[] args) {

        User user = new User();
        Transport ground = new Ground();
        Transport air = new Air();
        Transport water = new Water();
        Transport underground = new Underground();

        System.out.println("�����������!");

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

            user.countQuest();
            if (user.choice) {
                Ground.info();
                Air.info();
                Water.info();
                Underground.info();
            }

            user.choice = false;
            user.firstQuest();
        }

        System.out.println("�� ��������!");
    }

    static void createGround (Transport transport) {
        User user = new User();
        user.scanName();
        transport = new Ground(user.getName());
        transport.number();
    }

    static void createAir (Transport transport) {
        User user = new User();
        user.scanName();
        transport = new Air(user.getName());
        transport.number();
    }

    static void createWater (Transport transport) {
        User user = new User();
        user.scanName();
        transport = new Water(user.getName());
        transport.number();
    }

    static void createUnderground (Transport transport) {
        User user = new User();
        user.scanName();
        transport = new Underground(user.getName());
        transport.number();
    }
}
