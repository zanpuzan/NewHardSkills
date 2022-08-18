package by.vzanevsky.ООP.polymorpf;

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
        System.out.println("Воздушный: how ._.");
    }

}
