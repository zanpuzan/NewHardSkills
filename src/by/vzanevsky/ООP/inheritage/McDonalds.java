package by.vzanevsky.ООP.inheritage;

public class McDonalds {

    public String name;
    public String foodType;

    public McDonalds (String name, String foodType) {
        this.name = name;
        this.foodType = foodType;
    }

    public McDonalds(String name) {
    }

    public String getName() {
        return name;
    }

    public String getFoodType() {
        return foodType;
    }

    public void info () {
        System.out.println("Информация о продукте");
        System.out.printf("Название ресторана: %s \n", getName());
        System.out.printf("Тип еды: %s \n", getFoodType());
    }
}