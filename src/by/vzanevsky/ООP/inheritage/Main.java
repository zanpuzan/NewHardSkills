package by.vzanevsky.ООP.inheritage;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        StarterBox starter = new StarterBox("МакДоналдс","ФастФуд", "Основное", "Стартеры и боксы", "Чикен МакНаггетс");
        StarterBox box = new StarterBox("МакДоналдс","ФастФуд", "Основное", "Стартеры и боксы", "Снэк-бокс");
        BurgerRoll burger = new BurgerRoll("МакДоналдс","ФастФуд", "Основное", "Бургеры и роллы", "БигМак");
        BurgerRoll roll = new BurgerRoll("МакДоналдс","ФастФуд", "Основное", "Бургеры и роллы", "Цезарь Ролл");
        PotatoSalad potato = new PotatoSalad("МакДоналдс","ФастФуд", "Основное", "Картофель и салаты", "Картофель Фри");
        PotatoSalad salad = new PotatoSalad("МакДоналдс","ФастФуд", "Основное", "Картофель и салаты", "Салат Цезарь");
        Muffin muffin = new Muffin("МакДоналдс","ФастФуд", "МакЗавтрак", "МакМаффин", "Фреш МакМаффин");

        System.out.println("Добро пожаловать в МакДональдс!");
        user.firstQuest();

        while (user.choice) {

            System.out.printf(" 1. %1$s \n 2. %2$s \n 3. %3$s \n 4. %4$s \n 5. %5$s \n 6. %6$s \n 7. %7$s \n", burger.getProduct(), starter.getProduct(), potato.getProduct(), roll.getProduct(), box.getProduct(), salad.getProduct(), muffin.getProduct());
            user.scan();
            switch (user.answer) {
                case 1:
                    burger.info();
                    break;
                case 2:
                    starter.info();
                    break;
                case 3:
                    potato.info();
                    break;
                case 4:
                    roll.info();
                    break;
                case 5:
                    box.info();
                    break;
                case 6:
                    salad.info();
                    break;
                case 7:
                    muffin.info();
                    break;
            }

            user.choice = false;
            user.firstQuest();
        }

        System.out.println("До свидания!");
    }
}
