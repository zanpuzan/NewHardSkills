package by.vzanevsky.��P.Interface;

public class Storekeeper extends Worker {

    static final String POST = "���������";

    public Storekeeper (String name) {
        super(name);
    }

    public Storekeeper () {
    }

    @Override
    void info() {
        System.out.printf(" ��������: %1$s \n �������: %2$d \n ���������: %3$s \n \n", super.getName(), super.getAge(), POST);
    }

    @Override
    public void smokeBreak() {
        System.out.printf("%1$s %2$s - ", POST, super.getName());
        super.smokeBreak();
    }

    @Override
    public void lunch() {
        System.out.printf("%1$s %2$s ���� �� ���� - %3$s \n", POST, super.getName(), Menu.SET2.getSet());
    }
}
