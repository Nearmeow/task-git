package sweet;

public class Marshmallow extends AbstractSweet {

    private String colour;

    public Marshmallow(String name, double weight, int price, String colour) {
        super(name, weight, price);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return String.format("Наименование - %s, вес единицы - %.2f, цена единицы - %d, цвет - %s",
                super.getName(), super.getWeight(), super.getPrice(), colour);
    }
}
