package by.vzanevsky.multithreading;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        Random random = new Random();


        System.out.println('\n' +
                "Здравствуйте! Вы попали на состязание двух рандомных потоков!" + '\n' +
                "Каждый поток выдаст по 5 рандомных чисел, затем, сравним их суммы!" + '\n');

        do {
            System.out.println("Готовы к состязанию?");
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
                    System.out.println("Основной поток, число " + i + ": " + numb);
                    sum = sum + numb;
                }

                try{
                    newThread.join();
                }catch(InterruptedException e){}

                System.out.println('\n' +
                        "Сумма чисел основного потока :" + sum + '\n' +
                        "Сумма чисел вторичного потока равна : " + random.getSum() + '\n');

                if (sum > random.getSum()) {
                    System.out.println("Победил основной поток!" + '\n');
                } else if (sum < random.getSum()) {
                    System.out.println("Победил вторичный поток!" + '\n');
                } else {
                    System.out.println("Ничья :)" + '\n');
                }

                newThread.interrupt();

            }
        } while (user.isChoice());

        System.out.println('\n' + "До свидания!");

    }
}
