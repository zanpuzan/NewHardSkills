package by.vzanevsky.��P.OOP2;

public class Fish {

    private String name;
    private String color;
    private String fins;
    private String habitat;

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFins(String fins) {
        this.fins = fins;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getFins() {
        return fins;
    }
    public String getHabitat() {
        return habitat;
    }

    protected Fish(String name, String color, String fins, String habitat) {

        setName(name);
        setColor(color);
        setFins(fins);
        setHabitat(habitat);
    }

    void fishInfo () {
        System.out.println("���������� � ����� ����!");
        System.out.printf("��������: %s \n", getName());
        System.out.printf("����: %s \n", getColor());
        System.out.printf("���������� ���������: %s \n", getFins());
        System.out.printf("����� ��������: %s \n", getHabitat());
    }
}


