package by.vzanevsky.ООP.Interface;

public enum Menu {

    SET1 ("Комплекс 1: Пюре с котлетой + Чай"),
    SET2 ("Комплекс 2: Макароны с сосисками и сыром + Компот"),
    SET3 ("Комплекс 3: Солянка мясная + Сок");

    private String set;

    Menu (String set) {
        this.set = set;
    }

    public String getSet() {
        return set;
    }

    @Override
    public String toString() {
        return set + '\'';
    }
}
