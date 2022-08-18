package by.vzanevsky.ÎÎP.Interface;

abstract class Worker implements Smoke, Eat {

    private String name;
    private final int age = years();

    public Worker (String name) {
        this.name = name;
    }

    public Worker (){

    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    private int years() {
        int minAge = 19;
        int maxAge = 50;
        maxAge -= minAge;
        return (int) Math.round((Math.random() * ++maxAge) + minAge);
    }

    abstract void info();
}
