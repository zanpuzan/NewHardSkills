package by.vzanevsky.��P.Interface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        User user = new User();

        System.out.print("������������! �� - ��������� ������! \n� ��� � ������������ �������� ��� ����������� \n \n");
        
        System.out.print("�������, ");
        user.scanName();
        Worker loader = new Loader(user.getName());
        
        System.out.print("���������, ");
        user.scanName();
        Worker storekeeper = new Storekeeper(user.getName());
        
        System.out.print("���������, ");
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

        System.out.println("������� ������������, �������� ������ �� �������");
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
            System.out.println("�������! �� ��������!");
        } else {
            System.out.println("�� � �����. �� ��������!");
        }
    }
}
