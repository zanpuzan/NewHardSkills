package by.vzanevsky.ООP.objectAsParameter;

import by.vzanevsky.ООP.objectAsParameter.Transport;

public class Water extends by.vzanevsky.ООP.objectAsParameter.Transport {

    protected static String kind = "Водный";

    public Water(String name) {
        super(name);
    }

    public Water() {
    }

    public String getKind() {
        return kind;
    }

    @Override
    void info() {
        System.out.printf(" Объект: %1$s \n Вид: %3$s \n Название: %2$s \n", super.getObject(), super.getName(), getKind());
    }
}
