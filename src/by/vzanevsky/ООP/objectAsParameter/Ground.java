package by.vzanevsky.��P.objectAsParameter;

import by.vzanevsky.��P.objectAsParameter.Transport;

public class Ground extends by.vzanevsky.��P.objectAsParameter.Transport {

    protected static String kind = "��������";

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
        System.out.printf(" ������: %1$s \n ���: %3$s \n ��������: %2$s \n", super.getObject(), super.getName(), getKind());
    }
}
