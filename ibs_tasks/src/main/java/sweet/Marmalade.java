package sweet;

public class Marmalade extends AbstractSweet {

    private boolean isWithFruitJuice;

    public Marmalade(String name, double weight, int price, boolean isWithFruitJuice) {
        super(name, weight, price);
        this.isWithFruitJuice = isWithFruitJuice;
    }

    @Override
    public String toString() {
        return String.format("Наименование - %s, вес единицы - %.2f, цена единицы - %d, содержит фруктовый сок - %b",
                super.getName(), super.getWeight(), super.getPrice(), isWithFruitJuice);
    }
}
