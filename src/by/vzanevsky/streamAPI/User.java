package by.vzanevsky.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class User {

    Scanner sc = new Scanner(System.in);

    private String command;

    ArrayList <String> commandList = new ArrayList<>(Arrays.asList("INFO", "ABC", "DATE", "FAT", "SMALL", "MAM", "REP", "BIRD", "END"));

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

    public String getCommand() {
        return command;
    }

    protected void doInfo (){
        System.out.print('\n' + commandList.get(0) + " - информация \n" +
                commandList.get(1) + " - список по алфавиту \n" +
                commandList.get(2) + " - список по дате поступления \n" +
                commandList.get(3) + " - самое тяжелое животное \n" +
                commandList.get(4) + " - самое мелкое животное \n" +
                commandList.get(5) + " - список млекопитающих с количеством корма для них \n" +
                commandList.get(6) + " - список рептилий с количеством корма для них\n" +
                commandList.get(7) + " - список птиц с количеством корма для них\n" +
                commandList.get(8) + " - закончить работу \n");
    }
}
