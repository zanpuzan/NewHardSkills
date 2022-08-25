package by.vzanevsky.multithreading;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        Random random = new Random();


        System.out.println('\n' +
                "������������! �� ������ �� ���������� ���� ��������� �������!" + '\n' +
                "������ ����� ������ �� 5 ��������� �����, �����, ������� �� �����!" + '\n');

        do {
            System.out.println("������ � ����������?");
            user.scanChoice();
            if (user.isChoice()){

                Thread newThread = new Thread(random);
                newThread.start();

                int sum = 0;
                for (int i = 1; i <= 5; i++) {
                    int min = 0;
                    int max = 100;
                    max -= min;
                    int numb = (int)Math.round((Math.random() * ++max) + min);
                    System.out.println("�������� �����, ����� " + i + ": " + numb);
                    sum = sum + numb;
                }

                try{
                    newThread.join();
                }catch(InterruptedException e){}

                System.out.println('\n' +
                        "����� ����� ��������� ������ :" + sum + '\n' +
                        "����� ����� ���������� ������ ����� : " + random.getSum() + '\n');

                if (sum > random.getSum()) {
                    System.out.println("������� �������� �����!" + '\n');
                } else if (sum < random.getSum()) {
                    System.out.println("������� ��������� �����!" + '\n');
                } else {
                    System.out.println("����� :)" + '\n');
                }

                newThread.interrupt();

            }
        } while (user.isChoice());

        System.out.println('\n' + "�� ��������!");

    }
}
