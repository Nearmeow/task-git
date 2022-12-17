package sweet;

public class Chocolate extends AbstractSweet {

    private String chocoType;

    public Chocolate(String name, double weight, int price, String chocoType) {
        super(name, weight, price);
        this.chocoType = chocoType;
    }

    @Override
    public String toString() {
        return String.format("Наименование - %s, вес единицы - %.2f, цена единицы - %d, тип шоколада - %s",
                super.getName(), super.getWeight(), super.getPrice(), chocoType);
    }
}
