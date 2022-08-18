package by.vzanevsky.ООP.abstractClass;

public class Air extends Transport {

    public String kind = "Воздушный";

    public Air(String name) {
        super(name);
    }

    public Air() {
    }

    public String getKind() {
        return kind;
    }

    @Override
    void honk() {
        System.out.println("how ._.");
    }

    @Override
    void info() {
        System.out.printf(" Объект: %1$s \n Вид: %3$s \n Название: %2$s \n", super.getObject(), super.getName(), getKind());
    }
}
