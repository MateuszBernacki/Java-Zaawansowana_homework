package homework.task7;

import java.util.Arrays;

public class Dish implements Ingredient{

Ingredient[] breakfast = {
        new Egg("egg", 40.50), new Bread(100,"bred"), new Cheese(40.20,"ser"),
        new Tomato(52.50,"tomato"), new Salt(2, "salt"), new Cake(124.30,"very good cake")};

    public Dish(Ingredient[] breakfast) {
        this.breakfast = breakfast;
    }

    public Dish() {

    }

    @Override
    public double weight() {
        double weight = 0;
        for (Ingredient w :
                breakfast) {
            weight += w.weight();
        }
        return weight;
    }

    @Override
    public double calories() {
        double cal = 0;
        for (Ingredient w :
                breakfast) {
            cal += w.calories();
        }
        return cal;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "breakfast=" + Arrays.toString(breakfast) +
                '}';
    }
}
