package by.vzanevsky.��P.abstractClass;

public class Ground extends Transport {

    private String kind = "��������";

    protected Ground(String name){
        super(name);
    }

    public String getKind() {
        return kind;
    }

    @Override
    protected void honk() {
        System.out.println("beep beep :)");
    }

    @Override
    protected void info() {
        System.out.printf(" ������: %1$s \n ���: %3$s \n ��������: %2$s \n", super.getObject(), super.getName(), getKind());
    }
}
