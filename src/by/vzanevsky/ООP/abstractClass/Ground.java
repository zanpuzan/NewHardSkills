package by.vzanevsky.ООP.abstractClass;

public class Ground extends Transport {

    private String kind = "Наземный";

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
        System.out.printf(" Объект: %1$s \n Вид: %3$s \n Название: %2$s \n", super.getObject(), super.getName(), getKind());
    }
}
