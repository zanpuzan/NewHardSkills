package by.vzanevsky.ООP.OOP2;

public class Program {
    public static void main(String[] args) {

        MixName mixName = new MixName();
        User user = new User();


        System.out.println("Здравствуйте!");

        user.firstQuest();

        while (user.choice) {
            mixName.questionOne();
            mixName.questionTwo();
            mixName.questionThree();    
            mixName.createName();
            Fish fish = new Fish(mixName.name, mixName.color, mixName.fins, mixName.habitat);
            fish.fishInfo();
            user.choice = false;
            user.firstQuest();
        }

        System.out.println("Досвидания!");

    }
}
