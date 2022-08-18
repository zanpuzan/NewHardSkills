package by.vzanevsky.��P.inheritage;

public class BurgerRoll extends DailyMenu{

    private String sectionName;
    private String product;

    public BurgerRoll(String name, String foodType, String menuType, String sectionName, String product) {
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
        System.out.printf("������ ����: %s \n", getSectionName());
        System.out.printf("�������� ��������: %s \n", getProduct());
    }
}
