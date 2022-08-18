package by.vzanevsky.ООP.Interface;

public class Loader extends Worker {

    static final String POST = "Грузчик";

    public Loader(String name) {
        super(name);
    }

    public Loader () {
    }

    @Override
    void info() {
        System.out.printf(" Работник: %1$s \n Возраст: %2$d \n Должность: %3$s \n \n", super.getName(), super.getAge(), POST);
    }

    @Override
    public void smokeBreak() {
        System.out.printf("%1$s %2$s - ", POST, super.getName());
        super.smokeBreak();
    }

    @Override
    public void lunch() {
        System.out.printf("%1$s %2$s взял на обед - %3$s \n", POST, super.getName(), Menu.SET1.getSet());
    }
}
