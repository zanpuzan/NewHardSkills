package by.vzanevsky.??P.inheritage;

public class MorningMenu extends McDonalds {

    private String menuType;

    public MorningMenu(String name,String foodType, String menuType) {
        super(name, foodType);
        this.menuType = menuType;
    }

    public String getMenuType() {
        return menuType;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("??? ????: %s \n", getMenuType());
    }
}
