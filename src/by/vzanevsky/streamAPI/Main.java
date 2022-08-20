package by.vzanevsky.streamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        ArrayList<Animal> animalList = readAnimalList();

        System.out.println("\nДобро пожаловать в программу учета зверей зоопарка! \nCписок доступных команд:");
        user.doInfo();

        do {
            try {
                user.scanCommand();
            } catch (RuntimeException re) {
                System.out.println(re.getMessage());
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(0))) {
                user.doInfo();
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(1))) {
                animalList.sort((Comparator.comparing(Animal::getName)));
                animalList.forEach(Animal::info);
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(2))) {
                animalList.sort((Comparator.comparing(Animal::getReceiptDate)));
                animalList.forEach(Animal::info);
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(3))) {

            }

        } while (!user.getCommand().equalsIgnoreCase(user.commandList.get(9)));

        System.out.println("До свидания!");

    }

    public static ArrayList<Animal> readAnimalList (){

        ArrayList<Animal> animalList = new ArrayList<>();
        try {
            List<String> read = Files.readAllLines(Paths.get("src/animals.txt"));
            for (String line : read) {
                String [] lineSplit = (line.trim()).split("\\s+");
                if (lineSplit.length != 5) {
                    System.out.println("Нарушен формат строки!");
                    continue;
                }
                animalList.add(new Animal(lineSplit[0],
                                          lineSplit[1],
                         Integer.parseInt(lineSplit[2]),
                         Integer.parseInt(lineSplit[3]),
                                (new Date(lineSplit[4]))));
            }
        } catch (IOException e) {
            System.out.println("Нарушен формат строки!");
        }
        return animalList;
    }
}
