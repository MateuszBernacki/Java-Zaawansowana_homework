package homework.task12;

import java.util.Objects;

public class Egg implements Ingredient {
    private static final double CALORIES_PER_GRAM = 1.5;
    private final double weight;
    private final String name;

    public Egg(String name, double weight) {
        this.weight = weight;
        this.name = name;
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
        return weight * CALORIES_PER_GRAM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Egg egg = (Egg) o;
        return Double.compare(egg.weight, weight) == 0 && Objects.equals(name, egg.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name);
    }

    @Override
    public String toString() {
        return "Egg{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
