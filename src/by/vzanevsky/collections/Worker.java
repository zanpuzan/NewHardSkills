package by.vzanevsky.collections;

public class Worker  {

    private String name;
    private int salary;
    private int age = years();

    Worker (String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() { return age; }

    private int years() {
        int minAge = 19;
        int maxAge = 50;
        maxAge -= minAge;
        return (int) Math.round((Math.random() * ++maxAge) + minAge);
    }

    protected void info (){
        System.out.printf("\n��� ����������: %1$s " +
                          "\n������� ����������: %2$d " +
                          "\n�������� ����������: %3$d \n", name, age, salary);
    }
}
