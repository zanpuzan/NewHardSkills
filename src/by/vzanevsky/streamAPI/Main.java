package by.vzanevsky.streamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        ArrayList<Animal> animalList = readAnimalList();

        System.out.println("\nДобро пожаловать в список зверей зоопарка! \nCписок доступных команд:");
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
                animalList.stream().sorted((Comparator.comparing(Animal::getName))).forEach(Animal::info);
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(2))) {
                animalList.stream().sorted(Comparator.comparing(Animal::getReceiptDate)).forEach(Animal::info);
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(3))) {
                animalList.stream().max(Comparator.comparing(Animal::getWeight)).ifPresent(Animal::info);
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(4))) {
                animalList.stream().min(Comparator.comparing(Animal::getWeight)).ifPresent(Animal::info);
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(5))) {
                animalList.stream().filter(s -> s.getSpecies().equalsIgnoreCase("Млекопитающее")).forEach(Animal::info);
                animalList.stream().filter(s -> s.getSpecies().equalsIgnoreCase("Млекопитающее"))
                        .map(Animal::getFeed).reduce(Integer::sum)
                        .ifPresent(x -> System.out.println("\nКоличество корма в день: " + x + " кг"));
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(6))) {
                animalList.stream().filter(s -> s.getSpecies().equalsIgnoreCase("Рептилия")).forEach(Animal::info);
                animalList.stream().filter(s -> s.getSpecies().equalsIgnoreCase("Рептилия"))
                        .map(Animal::getFeed).reduce(Integer::sum)
                        .ifPresent(x -> System.out.println("\nКоличество корма в день: " + x + " кг"));
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(7))) {
                animalList.stream().filter(s -> s.getSpecies().equalsIgnoreCase("Птица")).forEach(Animal::info);
                animalList.stream().filter(s -> s.getSpecies().equalsIgnoreCase("Птица"))
                        .map(Animal::getFeed).reduce(Integer::sum)
                        .ifPresent(x -> System.out.println("\nКоличество корма в день: " + x + " кг"));
            }

        } while (!user.getCommand().equalsIgnoreCase(user.commandList.get(8)));

        System.out.println("До свидания!");

    }

    private static ArrayList<Animal> readAnimalList (){

        ArrayList<Animal> animalList = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yyyy");
        try {
            List<String> read = Files.readAllLines(Paths
                    .get("D:/Java/IdeaProjects/newHardSkills/src/by/vzanevsky/streamAPI/animals.txt"));
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
                             format.parse(lineSplit[4])));
            }
        } catch (IOException e) {
            System.out.println("Нарушен формат строки!");
        } catch (ParseException e) {
            System.out.println("Нарушен формат даты!");
        }
        return animalList;
    }
}
