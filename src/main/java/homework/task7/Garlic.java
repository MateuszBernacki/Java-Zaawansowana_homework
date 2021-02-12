package homework.task7;

public class Garlic implements Ingredient{

    private static final double CALORIES_PER_GRAM = 1.49;
    private final double weight;
    private final String name;

    public Garlic(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double calories() {
        return weight* CALORIES_PER_GRAM;
    }

    @Override
    public String toString() {
        return "Garlic{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
