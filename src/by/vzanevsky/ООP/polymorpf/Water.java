package by.vzanevsky.��P.polymorpf;

public class Water extends Transport{

    public String kind = "������";

    public Water(String name) {
        super(name);
    }
    public Water() {
    }

    public String getKind() {
        return kind;
    }

    @Override
    void honk() {
        System.out.println("������: woom woom :)");
    }

}
