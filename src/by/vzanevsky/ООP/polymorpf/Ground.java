package by.vzanevsky.��P.polymorpf;

public class Ground extends Transport {

    private String kind = "��������";

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
        System.out.println("��������: beep beep :)");
    }

}
