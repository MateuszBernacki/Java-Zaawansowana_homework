package homework.task7;

public class VegetableBroth implements Ingredient {
    private static final double CALORIES_PER_GRAM = 0.06;
    private final double weight;
    private final String name;

    public VegetableBroth(double weight, String name) {
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
        return "VegetableBroth{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
