package by.vzanevsky.ООP.ObjectConstuctor;

import java.util.Scanner;

public class Check {
    boolean result;
       public boolean result(int a, int b) {
        if (a == b){
            System.out.println("Правильный ответ!");
            return result = true;
        } else {
            System.out.println("Ответ неверный, попробуйте еще!");
            return result = false;
        }
    }
}
