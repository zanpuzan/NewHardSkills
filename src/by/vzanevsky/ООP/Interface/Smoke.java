package by.vzanevsky.ООP.Interface;

public interface Smoke {

    default void smokeBreak () {
        System.out.println("отошел покурить");
    }
}
