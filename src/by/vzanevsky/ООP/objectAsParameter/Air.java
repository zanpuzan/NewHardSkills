package by.vzanevsky.��P.objectAsParameter;

import by.vzanevsky.��P.objectAsParameter.Transport;

public class Air extends by.vzanevsky.��P.objectAsParameter.Transport {

    protected static String kind = "���������";

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
        System.out.printf(" ������: %1$s \n ���: %3$s \n ��������: %2$s \n", super.getObject(), super.getName(), getKind());
    }
}
