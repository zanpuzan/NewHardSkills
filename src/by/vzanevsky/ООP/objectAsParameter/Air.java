package by.vzanevsky.ООP.objectAsParameter;

import by.vzanevsky.ООP.objectAsParameter.Transport;

public class Air extends by.vzanevsky.ООP.objectAsParameter.Transport {

    protected static String kind = "Воздушный";

    public Air(String name) {
        super(name);
    }

    public Air() {
    }

    public String getKind() {
        return kind;
    }

    @Override
    void info() {
        System.out.printf(" Объект: %1$s \n Вид: %3$s \n Название: %2$s \n", super.getObject(), super.getName(), getKind());
    }
}
