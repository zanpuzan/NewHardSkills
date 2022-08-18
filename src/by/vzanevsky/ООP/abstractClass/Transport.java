package by.vzanevsky.��P.abstractClass;

abstract class Transport {

    private String name;
    private String object = "���������";

    public Transport(String name) {
        this.name = name;
    }

    protected Transport() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    abstract void honk();
    abstract void info();

}
