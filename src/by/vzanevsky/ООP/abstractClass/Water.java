package by.vzanevsky.��P.abstractClass;

public class Water extends Transport{

    public String kind = "������";

    public Water(String name) {
        super(name);
    }

    public String getKind() {
        return kind;
    }

    @Override
    void honk() {
        System.out.println("woom woom :)");
    }

    @Override
    void info() {
        System.out.printf(" ������: %1$s \n ���: %3$s \n ��������: %2$s \n", super.getObject(), super.getName(), getKind());
    }
}
