package homework.task7;

public class Cake implements Ingredient{

    //ciasto z czekolada
    private static final double CALORIES_PER_GRAM = 4.5;
    private final double weight;
    private final String name;

    public Cake(double weight, String name) {
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
        return "Cake{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
