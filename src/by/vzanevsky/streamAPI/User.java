package by.vzanevsky.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class User {

    Scanner sc = new Scanner(System.in);

    private String command;

    ArrayList <String> commandList = new ArrayList<>(Arrays.asList("INFO", "ABC", "DATE", "FAT", "SMALL", "MAM", "REP", "BIRD", "END"));

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

    public String getCommand() {
        return command;
    }

    protected void doInfo (){
        System.out.print('\n' + commandList.get(0) + " - ���������� \n" +
                commandList.get(1) + " - ������ �� �������� \n" +
                commandList.get(2) + " - ������ �� ���� ����������� \n" +
                commandList.get(3) + " - ����� ������� �������� \n" +
                commandList.get(4) + " - ����� ������ �������� \n" +
                commandList.get(5) + " - ������ ������������� � ����������� ����� ��� ��� \n" +
                commandList.get(6) + " - ������ �������� � ����������� ����� ��� ���\n" +
                commandList.get(7) + " - ������ ���� � ����������� ����� ��� ���\n" +
                commandList.get(8) + " - ��������� ������ \n");
    }
}
