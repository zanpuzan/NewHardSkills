package by.vzanevsky.��P.objectAsParameter;

import by.vzanevsky.��P.objectAsParameter.Transport;

public class Underground extends by.vzanevsky.��P.objectAsParameter.Transport {

    protected static String kind = "���������";

    public Underground(String name) {
        super(name);
    }

    public Underground() {
    }

    public String getKind() {
        return kind;
    }

    @Override
    void info() {
        System.out.printf(" ������: %1$s \n ���: %3$s \n ��������: %2$s \n", super.getObject(), super.getName(), getKind());
    }
}
