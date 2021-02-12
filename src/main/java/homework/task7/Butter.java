package homework.task7;

public class Butter implements Ingredient{

    private static final double CALORIES_PER_GRAM = 7.17;
    private final double weight;
    private final String name;

    public Butter(double weight, String name) {
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
        return "Botter{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
