package by.vzanevsky.ООP.staticLesson;

public class Ground extends Transport {

    protected static String kind = "Наземный";
    static int counter = 0;

    private int groundCounter;

    protected Ground(String name){
        super(name);
        groundCounter = ++counter;
    }

    protected Ground(){
    }

    public String getKind() {
        return kind;
    }


    protected static void info() {
        System.out.printf("%1$s: %2$d \n", kind, counter);
    }

    @Override
    protected void number() {
        System.out.printf("Номер транспорта:  %1$s-%2$d \n", kind, groundCounter);
    }
}
