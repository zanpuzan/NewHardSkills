package by.vzanevsky.��P.polymorpf;

public class Underground extends Transport{

    public String kind = "���������";

    public Underground(String name) {
        super(name);
    }
    public Underground() {
    }

    public String getKind() {
        return kind;
    }

    @Override
    void honk() {
        System.out.println("���������: tuu tuu :)");
    }

}
