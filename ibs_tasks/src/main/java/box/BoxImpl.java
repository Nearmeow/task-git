package box;

import sweet.AbstractSweet;

public interface BoxImpl {

    void addSweet(AbstractSweet sweet);
    void deleteSweet(Integer index);
    double getBoxWeight();
    int getBoxPrice();
    void printInfo();
    void optimizeWeight();
    void optimizePrice();
}
