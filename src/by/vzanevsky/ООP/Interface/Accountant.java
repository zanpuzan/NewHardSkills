package by.vzanevsky.ООP.Interface;

public class Accountant extends Worker {

    static final String POST = "Бухгалтер";

    public Accountant (String name) {
        super(name);
    }

    public Accountant () {
    }

    @Override
    void info() {
        System.out.printf(" Работник: %1$s \n Возраст: %2$d \n Должность: %3$s \n \n", super.getName(), super.getAge(), POST);
    }

    @Override
    public void smokeBreak() {
        System.out.printf("%1$s %2$s - воздержался \n", POST, super.getName());
    }

    @Override
    public void lunch() {
        System.out.printf("%1$s %2$s взял на обед - %3$s \n", POST, super.getName(), Menu.SET3.getSet());
    }
}
