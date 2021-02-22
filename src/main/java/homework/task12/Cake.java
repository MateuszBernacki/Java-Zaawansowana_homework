package homework.task12;

import java.util.Objects;

public class Cake implements Ingredient{
    private static double CALORIES_PER_GRAM = 0.2;
    final String name;
    final double weight;

    public Cake(String name, double weight) {
        this.name = name;
        this.weight = weight;
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
        Cake cake = (Cake) o;
        return Objects.equals(name, cake.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
