package by.vzanevsky.ООP.polymorpf;

public class Ground extends Transport {

    private String kind = "Наземный";

    protected Ground(String name){
        super(name);
    }
    protected Ground(){
    }

    public String getKind() {
        return kind;
    }

    @Override
    protected void honk() {
        System.out.println("Наземный: beep beep :)");
    }

}
