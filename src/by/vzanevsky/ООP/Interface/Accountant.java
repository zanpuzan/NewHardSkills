package by.vzanevsky.��P.Interface;

public class Accountant extends Worker {

    static final String POST = "���������";

    public Accountant (String name) {
        super(name);
    }

    public Accountant () {
    }

    @Override
    void info() {
        System.out.printf(" ��������: %1$s \n �������: %2$d \n ���������: %3$s \n \n", super.getName(), super.getAge(), POST);
    }

    @Override
    public void smokeBreak() {
        System.out.printf("%1$s %2$s - ����������� \n", POST, super.getName());
    }

    @Override
    public void lunch() {
        System.out.printf("%1$s %2$s ���� �� ���� - %3$s \n", POST, super.getName(), Menu.SET3.getSet());
    }
}
