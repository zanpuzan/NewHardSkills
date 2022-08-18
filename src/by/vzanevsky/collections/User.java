package by.vzanevsky.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class User {

    Scanner sc = new Scanner(System.in);

    private String fullName;
    private String command;
    private int salary;

    ArrayList <String> commandList = new ArrayList<>(Arrays.asList("INFO", "ADD", "DELETE", "LIST", "AMOUNT", "INFILE", "OUTFILE", "ABC", "SALARY", "END"));

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    protected void scanCommand () {
        System.out.print("\nВведите команду: ");
        String command = sc.nextLine().trim();
        if (checkCommand(command)) {
            this.command = command;
        } else {
            this.command = "exception";
            throw new RuntimeException("Неверная команда!");
        }
    }

    private boolean checkCommand (String command) {
        boolean result = false;
        for (String str : commandList) {
           if (command.equalsIgnoreCase(str)) {
               result = true;
           }
        }
        return result;
    }

    protected void doInfo (){
        System.out.print('\n' + commandList.get(0) + " - информация \n" +
                                commandList.get(1) + " - добавить работника \n" +
                                commandList.get(2) + " - удалить работника \n" +
                                commandList.get(3) + " - данные работников \n" +
                                commandList.get(4) + " - количество работников \n" +
                                commandList.get(5) + " - записать данные в файл \n" +
                                commandList.get(6) + " - прочитать данные из файла\n" +
                                commandList.get(7) + " - список работников по алфавиту\n" +
                                commandList.get(8) + " - список работников по зарплате \n" +
                                commandList.get(9) + " - закончить работу \n");
    }

    protected void scanName() {
        System.out.print("\nВведите Ф.И.О: ");
        String[] fullName = (sc.nextLine().trim()).split("\\s+");
        if (fullName.length != 3) {
            throw new RuntimeException("Неверный формат!");
        } else {
            this.fullName = String.join(" ", fullName);
        }
    }

    protected void scanSalary() {
        int salary = 0;
        System.out.print("Введите зарплату: ");
        try {
            salary = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException ex) {
            System.out.println("Неверные данные!");
            scanSalary();
        }

        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new RuntimeException("Неверное значение!");
        }
    }

    public String getCommand() {
        return command;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
