import box.Box;
import sweet.AbstractSweet;
import sweet.Chocolate;
import sweet.Marmalade;
import sweet.Marshmallow;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    private static final AbstractSweet CHOCOLATE = new Chocolate("Шоколад Алёнка", 0.2, 95, "Молочный");
    private static final AbstractSweet MARSHMALLOW = new Marshmallow("Зефир классический", 0.1, 150, "Розовый");
    private static final AbstractSweet MARMALADE = new Marmalade("Мармелад мишки", 0.5, 45, true);

    public static void main(String[] args) {

        System.out.println("Введите вес подарка: ");
        double size = in.nextDouble();
        Box box = new Box(size);

        askUserAndFillTheBox(box);

        if (box.getBoxWeight() > size) {
            System.out.printf("Текущий вес сладостей - %.2f, что превышает требуемый - %.2f \n", box.getBoxWeight(), size);
            optimizeSweets(box);
            System.out.println("Итоговый список сладостей:");
            box.printInfo();
        }
        System.out.printf("Общий вес подарка - %.2f, общая стоимость подарка - %d", box.getBoxWeight(), box.getBoxPrice());
        in.close();
    }

    private static void askUserAndFillTheBox(Box box) {
        System.out.println("Сколько добавить шоколада? ");
        addSweetToBox(box, CHOCOLATE);

        System.out.println("Сколько добавить зефира? ");
        addSweetToBox(box, MARSHMALLOW);

        System.out.println("Сколько добавить мармелада? ");
        addSweetToBox(box, MARMALADE);

        System.out.println("Текущий список сладостей:");
        box.printInfo();
    }

    private static void addSweetToBox(Box box, AbstractSweet sweet) {
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            box.addSweet(sweet);
        }
    }

    private static void optimizeSweets(Box box) {
        System.out.println("Для удаления сладостей с меньшей ценой введите 1.");
        System.out.println("Для удаления сладостей с меньшим весом введите 2.");
        int num = in.nextInt();
        switch (num) {
            case 1:
                box.optimizePrice();
                break;
            case 2:
                box.optimizeWeight();
                break;
            default:
                System.out.println("Введено неверное число.");
                optimizeSweets(box);
        }
    }
}
