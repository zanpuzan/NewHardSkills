package by.vzanevsky.��P.inheritage;

public class McDonalds {

    public String name;
    public String foodType;

    public McDonalds (String name, String foodType) {
        this.name = name;
        this.foodType = foodType;
    }

    public McDonalds(String name) {
    }

    public String getName() {
        return name;
    }

    public String getFoodType() {
        return foodType;
    }

    public void info () {
        System.out.println("���������� � ��������");
        System.out.printf("�������� ���������: %s \n", getName());
        System.out.printf("��� ���: %s \n", getFoodType());
    }
}