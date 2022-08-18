package by.vzanevsky.ООP.objectAsParameter;

import by.vzanevsky.ООP.objectAsParameter.Transport;

public class Ground extends by.vzanevsky.ООP.objectAsParameter.Transport {

    protected static String kind = "Наземный";

    protected Ground(String name){
        super(name);
    }

    protected Ground(){
    }

    public String getKind() {
        return kind;
    }

    @Override
    protected void info() {
        System.out.printf(" Объект: %1$s \n Вид: %3$s \n Название: %2$s \n", super.getObject(), super.getName(), getKind());
    }
}
