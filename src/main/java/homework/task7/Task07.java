package homework.task7;

/**
 * 1. Zdefiniuj klasy implementujące interfejs Ingredient, która opisuje wagę i kaloryczność składnika dania
 *    - Cheese
 *    - Tomato
 *    - Cake
 *    - Salt
 *    Przy definicji wzoruj się na klasie Egg, możesz też samodzielnie dodać dodakowe pole, jak np. smak, czy koloryczność jednostkową podawaną w konstruktorze
 * 2. Zdefiniuj klasę Dish też implementującą interfejs Ingredient,
 *    - z polem w postaci tablicy obiektów implementujących Ingredient
 *    - z konstruktorem przyjmujący tablicę takich obiektów np. Dish(new Ingredients[]{chees, cake}), gdzie cheese i cake są obiektami klas Cheese i Cake
 *    - z metodami interfejsowymi zwracającymi wagę i kaloryczność całego dania
 * 3. Stwórz kilka różnych obiektów klasy Dish, z różnymi składnikami i przetestuj czy poprawnie działają metody klasy
 * 4. Stwórz obiekt klasy Dish, w którym jednym ze składników jest inne danie.
 * Dla chętnych i ambitnych
 * 5. Zrób całe zadanie uwzględniając cenę składników i całego dania, przy czym nie każdy składnik musi mieć cenę (np. Salt), ale każde danie cenę posiada
 * Wskazówki
 * 1. Zdefiniuj osobno interfejs Valuable z metodą abstrakcyjną zwracająca cenę składnika, oraz interfejs ValuableIngredient łączący oba interfejsy
 * 2. Przy obliczaniu ceny dania należy operatorem instanceof wykryć, który składnik ma cenę
 */
public class Task07 {
    public static void main(String[] args) {
        Dish products = new Dish();
        Ingredient addsToSoup = new Dish(new Ingredient[]{new Pepper(1,"peper"), new Butter(10, "butter"),new Bread(150, "best breed")});
        Ingredient tomatoCream = new Dish(new Ingredient[]{new Tomato(500,"tomato"), new VegetableBroth(375,"Veg Broth"), new Onion(50,"onion"), new Garlic(10,"garlic"), new Butter(40,"butter")
                , new Sugar(5, "sugar"), new Salt(5, "salt"), new Pepper(3,"pepper"),addsToSoup});

        System.out.println("Tomato cream" + tomatoCream);
        System.out.println("Tomato cream weight: " + tomatoCream.weight());
        System.out.println("Tomato cream cal: " + tomatoCream.calories());

//        System.out.println("Adds to soup " + addsToSoup);
//        System.out.println("Breakfast " + products);
//        System.out.println("Breakfast weight: " + products.weight());
//        System.out.println("Breakfast cal: " +products.calories());
    }

}


