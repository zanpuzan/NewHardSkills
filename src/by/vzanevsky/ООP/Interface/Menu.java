package by.vzanevsky.��P.Interface;

public enum Menu {

    SET1 ("�������� 1: ���� � �������� + ���"),
    SET2 ("�������� 2: �������� � ��������� � ����� + ������"),
    SET3 ("�������� 3: ������� ������ + ���");

    private String set;

    Menu (String set) {
        this.set = set;
    }

    public String getSet() {
        return set;
    }

    @Override
    public String toString() {
        return set + '\'';
    }
}
