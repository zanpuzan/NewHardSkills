package by.vzanevsky.��P.polymorpf;

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
        System.out.println("���������: how ._.");
    }

}
