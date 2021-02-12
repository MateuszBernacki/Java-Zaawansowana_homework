package homework.task7;

public class Pepper implements Ingredient{
    private static final double CALORIES_PER_GRAM = 0.40;
    private final double weight;
    private final String name;

    public Pepper(double weight, String name) {
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
        return "Pepper{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
