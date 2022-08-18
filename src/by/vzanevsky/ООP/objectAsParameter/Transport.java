package by.vzanevsky.ООP.objectAsParameter;

abstract class Transport {

    private String name;
    private String object = "Транспорт";

    public Transport(String name) {
        this.name = name;
    }

    public Transport() {
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

    abstract void info();

}