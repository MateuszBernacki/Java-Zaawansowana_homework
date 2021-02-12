package homework.task7;

import java.util.Arrays;

public class Dish implements Ingredient{

Ingredient[] products = {
        new Egg("egg", 40.50), new Bread(100,"bred"), new Cheese(40.20,"ser"),
        new Tomato(52.50,"tomato"), new Salt(2, "salt"), new Cake(124.30,"very good cake")};

    public Dish(Ingredient[] products) {
        this.products = products;
    }

    public Dish() {

    }

    @Override
    public double weight() {
        double weight = 0;
        for (Ingredient w :
                products) {
            weight += w.weight();
        }
        return weight;
    }

    @Override
    public double calories() {
        double cal = 0;
        for (Ingredient w :
                products) {
            cal += w.calories();
        }
        return cal;
    }

    @Override
    public String toString() {
        return "{" + Arrays.toString(products) +
                '}';
    }
}
