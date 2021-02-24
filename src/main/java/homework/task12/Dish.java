package homework.task12;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Dish implements Ingredient {
    Set<Ingredient> ingredients = new LinkedHashSet<>();
    final String name;
    final double weight;
    final double calories;
    Ingredient ingredient;

    public Dish(String name, double weight, double calories, Set<Ingredient> ingredients) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.ingredients = ingredients;
    }

    public Dish(String name, double weight, double calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    public void addingredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void ingredients() {
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double calories() {
        return weight * calories;
    }
}
