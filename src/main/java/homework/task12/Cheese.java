package homework.task12;

import java.util.Objects;

public class Cheese implements Ingredient{

    final String name;
    final double weight;
    final double calories;

    public Cheese(String name, double weight, double calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cheese cheese = (Cheese) o;
        return Double.compare(cheese.weight, weight) == 0 && Double.compare(cheese.calories, calories) == 0 && Objects.equals(name, cheese.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, calories);
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", calories=" + calories +
                '}';
    }
}
