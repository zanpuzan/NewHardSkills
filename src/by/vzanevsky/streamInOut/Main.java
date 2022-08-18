package by.vzanevsky.streamInOut;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args) throws IOException {

        User user = new User();

        System.out.println("Задача: записать данные в файл, а затем прочитать их оттуда");

        do {
            try {
                 user.scanName();
            } catch (RuntimeException re) {
                 System.out.println(re.getMessage());
            }
        } while (user.fullName == null);

        System.out.println("Отлично! Идем дальше");

        do {
            try {
                 user.scanAge();
            } catch (RuntimeException re) {
                 System.out.println(re.getMessage());
            }
        } while (user.age == null);

        Writer writer = new FileWriter("D://info.txt", false);
        writer.write(user.fullName);
        writer.append('\n');
        writer.write(user.age);
        writer.flush();
        writer.close();

        System.out.println("Считываем введенные значения!");

        FileReader reader = new FileReader("D://info.txt");
        StringBuilder builder = new StringBuilder();
        int i;
        while ((i = reader.read()) != -1) {
            builder.append((char) i);
        }
        System.out.println(builder.toString());
        reader.close();

        System.out.println("Спасибо за информацию ._.");
    }
}

