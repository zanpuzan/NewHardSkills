package by.vzanevsky.collections;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        User user = new User();

        HashSet <Worker> workerSet = new HashSet<>(10, 0.8F);

        System.out.println("\nДобро пожаловать в программу учета сотрудников! \nCписок доступных команд:");
        user.doInfo();

        do {
            try {
                user.scanCommand();
            } catch (RuntimeException re) {
                System.out.println(re.getMessage());
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(0))) {
                user.doInfo();
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(1))) {
                do {
                    user.setFullName(null);
                    try {
                        user.scanName();
                    } catch (RuntimeException re) {
                        System.out.println(re.getMessage());
                    }
                } while (user.getFullName() == null);

                do {
                    user.setSalary(0);
                    try {
                        user.scanSalary();
                    } catch (RuntimeException re) {
                        System.out.println(re.getMessage());
                    }
                } while (user.getSalary() == 0);

                workerSet.add(new Worker(user.getFullName(), user.getSalary()));
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(2))) {
                do {
                    user.setFullName(null);
                    try {
                        user.scanName();
                    } catch (RuntimeException re) {
                        System.out.println(re.getMessage());
                    }
                } while (user.getFullName() == null);

                if (workerSet.removeIf(worker -> worker.getName().equalsIgnoreCase(user.getFullName()))) {
                    System.out.println("Успешно!");
                } else {
                    System.out.println("Нет такого сотрудника!");
                }
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(3))) {
                workerSet.forEach(Worker::info);
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(4))) {
                System.out.println("\nТекущее количество работников: " + workerSet.size());
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(5))) {
                Writer writer = new FileWriter("D://workers.txt", false);
                for (Worker info: workerSet) {
                    writer.append('\n');
                    writer.write(" - Cотрудник: " + info.getName());
                    writer.append('\n');
                    writer.write(" - Возраст: " + info.getAge());
                    writer.append('\n');
                    writer.write(" - Зарплата: " + info.getSalary());
                }
                writer.flush();
                writer.close();
                System.out.println("Сохранено!");
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(6))) {
                FileReader reader = new FileReader("D://workers.txt");
                StringBuilder builder = new StringBuilder();
                System.out.println("Данные сотрудников из файла: ");
                int i;
                while ((i = reader.read()) != -1) {
                    builder.append((char) i);
                }
                System.out.println(builder);
                reader.close();
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(7))) {
                List <String> list = new ArrayList<>();
                System.out.println();
                for (Worker info: workerSet) {
                    list.add(info.getName());
                }
                Collections.sort(list);
                listInfo(list);
                continue;
            }

            if (user.getCommand().equalsIgnoreCase(user.commandList.get(8))) {
                List<Integer> list = new ArrayList<>();
                System.out.println();
                for (Worker info: workerSet) {
                    list.add(info.getSalary());
                }
                Collections.sort(list);
                Collections.reverse(list);
                listInfo(list);
            }

        } while (!user.getCommand().equalsIgnoreCase(user.commandList.get(9)));

        System.out.println("До свидания!");
    }

    public static <T> void listInfo(Collection<T> collection) {
        for (T element : collection) {
            System.out.println("- " + element + " -");
        }
    }
}
