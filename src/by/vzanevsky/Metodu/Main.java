package by.vzanevsky.Metodu;

public class Main {
    public static void main(String[] args) {

        System.out.println("Программа, рассчитывающая количество дней до нового года");

        User user = new User();
        Count count = new Count();
        user.countDate(count);

    }
}
