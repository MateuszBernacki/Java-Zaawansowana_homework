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
        if(!ingredients.contains(cake)) {
            addingredient(new Cake("ciasto", 1000));
            return true;
        }
        else return false;
    }
    public boolean addChease(Cheese cheese){
        if(!ingredients.contains(cheese)) {
            addingredient(new Cheese("ser",140,0.2));
            return true;
        }else return false;
    }

    public boolean addTomato(Tomato tomato){
        if (!ingredients.contains(tomato)) {
            addingredient(new Tomato("pomidor",250,0.04));
            return true;
        }else return false;
    }

    //dodaj metody dodające pozostałe składniki
    public boolean isReady(Cake cake,Cheese cheese,Tomato tomato) {
        //zwróć true jeśli są wszystkie składniki
        return (ingredients.contains(cake)&&ingredients.contains(cheese)&&ingredients.contains(tomato));
    }


}
