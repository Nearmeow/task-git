package box;

import sweet.AbstractSweet;

import java.util.ArrayList;
import java.util.Comparator;

public class Box implements BoxImpl {

    private static ArrayList<AbstractSweet> boxArray = new ArrayList<>();
    private double boxWeight;

    public Box(double boxWeight) {
        this.boxWeight = boxWeight;
    }

    @Override
    public void addSweet(AbstractSweet sweet) {
        boxArray.add(sweet);
    }

    @Override
    public void deleteSweet(Integer index) {
        if (index == null) {
            boxArray.remove(boxArray.size() - 1);
        } else boxArray.remove(index);
    }

    @Override
    public double getBoxWeight() {
        double boxWeight = 0;
        for (AbstractSweet sweet : boxArray) {
            boxWeight += sweet.getWeight();
        }
        return boxWeight;
    }

    @Override
    public int getBoxPrice() {
        int boxPrice = 0;
        for (AbstractSweet sweet : boxArray) {
            boxPrice += sweet.getPrice();
        }
        return boxPrice;
    }

    @Override
    public void printInfo() {
        for (AbstractSweet sweet : boxArray) {
            System.out.println(sweet.toString());
        }
    }

    @Override
    public void optimizeWeight() {
        boxArray.sort(Comparator.comparingDouble(AbstractSweet::getWeight).reversed());
        optimize();
    }

    @Override
    public void optimizePrice() {
        boxArray.sort(Comparator.comparingInt(AbstractSweet::getPrice).reversed());
        optimize();
    }

    private void optimize() {
        while(getBoxWeight() > boxWeight) {
            deleteSweet(null);
        }
    }
}
