package by.vzanevsky.ООP.polymorpf;

public class Water extends Transport{

    public String kind = "Водный";

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
        System.out.println("Водный: woom woom :)");
    }

}
