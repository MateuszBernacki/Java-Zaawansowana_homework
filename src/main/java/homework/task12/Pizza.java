package homework.task12;

import java.util.Set;

public class Pizza extends Dish implements Ingredient {
    public Pizza(String name, double weight, double calories, Set<Ingredient> ingredients) {
        super(name, weight, calories, ingredients);
    }

    public Pizza(String pizza, int weight, double calories) {
        super(pizza, weight, calories);
    }

    public boolean addCake(Cake cake) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient instanceof Cake) return false;
        }
        return addingredient(new Cake("ciasto", 200));
    }
    public boolean addChease(Cheese cheese){
        for (Ingredient ingredient : ingredients) {
            if (ingredient instanceof Cheese) return false;
        }
        return addingredient(new Cheese("ser",140,0.2));
    }

    public boolean addTomato(Tomato tomato){
        for (Ingredient ingredient : ingredients) {
            if (ingredient instanceof Tomato) return false;
        }
         return addingredient(new Tomato("pomidor",250,0.04));
    }

    //dodaj metody dodające pozostałe składniki
    public boolean isReady(Cake cake,Cheese cheese,Tomato tomato) {
        //zwróć true jeśli są wszystkie składniki
        return (ingredients.contains(cake)&&ingredients.contains(cheese)&&ingredients.contains(tomato));
    }


}
