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
        System.out.print("\n������� �������: ");
        String command = sc.nextLine().trim();
        if (checkCommand(command)) {
            this.command = command;
        } else {
            this.command = "exception";
            throw new RuntimeException("�������� �������!");
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
        System.out.print('\n' + commandList.get(0) + " - ���������� \n" +
                                commandList.get(1) + " - �������� ��������� \n" +
                                commandList.get(2) + " - ������� ��������� \n" +
                                commandList.get(3) + " - ������ ���������� \n" +
                                commandList.get(4) + " - ���������� ���������� \n" +
                                commandList.get(5) + " - �������� ������ � ���� \n" +
                                commandList.get(6) + " - ��������� ������ �� �����\n" +
                                commandList.get(7) + " - ������ ���������� �� ��������\n" +
                                commandList.get(8) + " - ������ ���������� �� �������� \n" +
                                commandList.get(9) + " - ��������� ������ \n");
    }

    protected void scanName() {
        System.out.print("\n������� �.�.�: ");
        String[] fullName = (sc.nextLine().trim()).split("\\s+");
        if (fullName.length != 3) {
            throw new RuntimeException("�������� ������!");
        } else {
            this.fullName = String.join(" ", fullName);
        }
    }

    protected void scanSalary() {
        int salary = 0;
        System.out.print("������� ��������: ");
        try {
            salary = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException ex) {
            System.out.println("�������� ������!");
            scanSalary();
        }

        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new RuntimeException("�������� ��������!");
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
