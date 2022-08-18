package by.vzanevsky.��P.abstractClass;

public class Air extends Transport {

    public String kind = "���������";

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
        System.out.printf(" ������: %1$s \n ���: %3$s \n ��������: %2$s \n", super.getObject(), super.getName(), getKind());
    }
}
