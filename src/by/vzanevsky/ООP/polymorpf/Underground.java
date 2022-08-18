package by.vzanevsky.ООP.polymorpf;

public class Underground extends Transport{

    public String kind = "Подземный";

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
        System.out.println("Подземный: tuu tuu :)");
    }

}
