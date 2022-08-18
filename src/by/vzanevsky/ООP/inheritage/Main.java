package by.vzanevsky.��P.inheritage;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        StarterBox starter = new StarterBox("����������","�������", "��������", "�������� � �����", "����� ����������");
        StarterBox box = new StarterBox("����������","�������", "��������", "�������� � �����", "����-����");
        BurgerRoll burger = new BurgerRoll("����������","�������", "��������", "������� � �����", "������");
        BurgerRoll roll = new BurgerRoll("����������","�������", "��������", "������� � �����", "������ ����");
        PotatoSalad potato = new PotatoSalad("����������","�������", "��������", "��������� � ������", "��������� ���");
        PotatoSalad salad = new PotatoSalad("����������","�������", "��������", "��������� � ������", "����� ������");
        Muffin muffin = new Muffin("����������","�������", "����������", "���������", "���� ���������");

        System.out.println("����� ���������� � �����������!");
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

        System.out.println("�� ��������!");
    }
}
