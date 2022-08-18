package by.vzanevsky.��P.staticLesson;

public class Water extends Transport {

    protected static String kind = "������";
    static int counter = 0;
    private int waterCounter;

    public Water(String name) {
        super(name);
        waterCounter = ++counter;
    }

    public Water() {
    }

    public String getKind() {
        return kind;
    }

    protected static void info() {
        System.out.printf("%1$s: %2$d \n", kind, counter);
    }

    @Override
    protected void number() {
        System.out.printf("����� ����������:  %1$s-%2$d \n", kind, waterCounter);
    }
}
