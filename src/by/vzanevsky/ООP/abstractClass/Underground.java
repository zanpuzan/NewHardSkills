package by.vzanevsky.��P.abstractClass;

public class Underground extends Transport{

    public String kind = "���������";

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
        System.out.printf(" ������: %1$s \n ���: %3$s \n ��������: %2$s \n", super.getObject(), super.getName(), getKind());
    }
}
