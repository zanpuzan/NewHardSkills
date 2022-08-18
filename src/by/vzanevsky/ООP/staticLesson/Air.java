package by.vzanevsky.��P.staticLesson;

public class Air extends Transport{

    protected static String kind = "���������";
    static int counter = 0;
    private int airCounter;

    public Air(String name) {
        super(name);
        airCounter = ++counter;
    }

    public Air() {
    }

    public String getKind() {
        return kind;
    }

    protected static void info() {
        System.out.printf("%1$s: %2$d \n", kind, counter);
    }

    @Override
    protected void number() {
        System.out.printf("����� ����������:  %1$s-%2$d \n", kind, airCounter);
    }

}
