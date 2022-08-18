package by.vzanevsky.ООP.Interface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        System.out.print("Здравствуйте! Вы - начальник склада! \nК вам в распоряжение поступил ряд сотрудников \n \n");
        
        System.out.print("Грузчик, ");
        user.scanName();
        Worker loader = new Loader(user.getName());
        
        System.out.print("Кладовщик, ");
        user.scanName();
        Worker storekeeper = new Storekeeper(user.getName());
        
        System.out.print("Бухгалтер, ");
        user.scanName();
        Worker accountant = new Accountant(user.getName());

        System.out.println();
        user.infoQuest();
        System.out.println();
        if (user.choice) {
            Worker [] mas = {loader, storekeeper, accountant};
            for (Worker worker: mas) {
                worker.info();
            }
        }

        System.out.println("Немного потрудившись, позвучал запрос на перекур");
        user.smokeQuest();
        System.out.println();
        if (user.choice) {
            Worker [] mas = {loader, storekeeper, accountant};
            for (Worker worker: mas) {
               worker.smokeBreak();
            }
        }

        System.out.println();
        user.menuQuest();
        System.out.println();
        if (user.choice) {
            System.out.println(Arrays.toString(Menu.values()));
            System.out.println();
        }

        Worker [] mas = {loader, storekeeper, accountant};
        for (Worker worker: mas) {
            worker.lunch();
        }

        System.out.println();
        user.lunchQuest();
        System.out.println();
        if (user.choice) {
            System.out.println("Отлично! До свидания!");
        } else {
            System.out.println("Ну и ладно. До свидания!");
        }
    }
}
