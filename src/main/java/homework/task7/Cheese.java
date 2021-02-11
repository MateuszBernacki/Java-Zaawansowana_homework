package homework.task7;

public class Cheese implements Ingredient{
    //ser żółty :)
    private static final double CALORIES_PER_GRAM = 3.5;
    private final double weight;
    private final String name;

    public Cheese(double weight, String name) {
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
        return "Cheese{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
