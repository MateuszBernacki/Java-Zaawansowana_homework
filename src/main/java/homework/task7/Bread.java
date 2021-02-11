package homework.task7;

public class Bread implements Ingredient{

    private static final double CALORIES_PER_GRAM = 2.64;
    private final double weight;
    private final String name;

    public Bread(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double calories() {
        return weight*CALORIES_PER_GRAM;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
