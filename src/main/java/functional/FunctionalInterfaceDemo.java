package functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person{
    final String name;
    final int point;

    public Person(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Predicate<Person> isPointGraterThan10 = person -> person.getPoint() >10;
        Person person = new Person("ADAM", 34);
        if (person.getPoint()>10) {
            System.out.println("ok");
        }
        Predicate<Person> filter= isPointGraterThan10;
        //wywolujemy predykat, nadajemy argument, konkretny obiekt
        if (filter.test(person)){
            System.out.println("OK");
        }
        filter = p -> p.getName().contains("A");
        if (filter.test(person)){
            System.out.println("ok");
        }
        //SUPLIER
        /*
        * Person Get(){
        * return new Person("ADA", 3);
        * }
        * */
        Supplier<Person> createPerson = () -> new Person("ADAM", 3);
        //CONSUMER
        Consumer<Person> print = p -> System.out.println("imie "+ p.getName()+ ", punkty " + p.getPoint());

        print.accept(person);

        //FUNCTION
        /*
        * int apply(Person p){
        * return p.getPoints()*10;
        * }
        * */
        Function<Person, Integer> points = p -> p.getPoint() * 10;
        System.out.println(points.apply(person));
    }
}
