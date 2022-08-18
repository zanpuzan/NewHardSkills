package by.vzanevsky.ООP.staticLesson;

public class Underground extends Transport {

    protected static String kind = "Подземный";
    static int counter = 0;
    private int undergroundCounter;

    public Underground(String name) {
        super(name);
        undergroundCounter = ++counter;
    }

    public Underground() {
    }

    public String getKind() {
        return kind;
    }

    protected static void info() {
        System.out.printf("%1$s: %2$d \n", kind, counter);
    }

    @Override
    protected void number() {
        System.out.printf("Номер транспорта:  %1$s-%2$d \n", kind, undergroundCounter);
    }
}
