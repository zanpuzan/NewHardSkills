package by.vzanevsky.Metodu;

import java.util.Scanner;

public class User {


    void countDate(Count count) {

        int dayNow = count.getDay();
        int monthNow = count.getMonth();

        count.dayCount(dayNow,monthNow);

    }
}
