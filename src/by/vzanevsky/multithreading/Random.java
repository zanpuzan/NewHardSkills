package by.vzanevsky.multithreading;

import static java.lang.Thread.sleep;

public class Random implements Runnable {

    private int sum;

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int min = 0;
            int max = 100;
            max -= min;
            int numb = (int)Math.round((Math.random() * ++max) + min);
            System.out.println("Вторичный поток, число " + i + ":" + numb);
            sum = sum + numb;
        }

        try {
            sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Ошибка потока");
        }

        this.sum = sum;
    }
}
