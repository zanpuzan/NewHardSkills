package by.vzanevsky.ООP.abstractClass;

public class Underground extends Transport{

    public String kind = "Подземный";

    public Underground(String name) {
        super(name);
    }

    public String getKind() {
        return kind;
    }

    @Override
    void honk() {
        System.out.println("tuu tuu :)");
    }

    @Override
    void info() {
        System.out.printf(" Объект: %1$s \n Вид: %3$s \n Название: %2$s \n", super.getObject(), super.getName(), getKind());
    }
}
