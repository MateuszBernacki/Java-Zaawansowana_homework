package generics;

import java.time.LocalDate;

public class Person implements Boxable<Person>{
    final String name;
    final double height;

    public Person(String name, LocalDate of, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public Person getValue() {
        return getValue();
    }
}
