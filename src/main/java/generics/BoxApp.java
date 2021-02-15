package generics;

import java.time.LocalDate;

public class BoxApp {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Test", 10);
        System.out.println(stringBox.content());
        Box<Integer> intigeerBox = new Box<>(125, 5);
        System.out.println(intigeerBox.content());
        Box<Person> personBox = new Box<>(new Person("robek", LocalDate.of(2000, 10, 10), 123), 200);
        System.out.println(personBox.content());
        // do pudełka można dodać typ bazowego (person) mozna dodać typ pochodny po person (User)
        personBox = new Box<>(new User("roberk",156.2,"rob@gmail.com"), 80 );
        System.out.println(personBox.content());

        Box<Boxable> uniwersalBxo = new Box<>(new User("robert", 124, "ksdjfj@gmail.com"), 34);
        uniwersalBxo = new Box<>(new StringBoxAble("test"),30);
        System.out.println( uniwersalBxo.content());
    }
}
