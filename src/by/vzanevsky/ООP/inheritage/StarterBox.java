package by.vzanevsky.ООP.inheritage;

public class StarterBox extends DailyMenu {

    private String sectionName;
    private String product;

    public StarterBox(String name, String foodType, String menuType,String sectionName, String product) {
        super(name, foodType, menuType);
        this.sectionName = sectionName;
        this.product = product;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("Раздел меню: %s \n", getSectionName());
        System.out.printf("Название продукта: %s \n", getProduct());


    }
}
