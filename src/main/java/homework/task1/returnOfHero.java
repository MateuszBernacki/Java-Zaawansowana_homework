package homework.task1;

import homework.task1.Person;

import java.time.LocalDate;

public class returnOfHero extends Person {

    public returnOfHero(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public String toString()  {
    return "Bohater " + name + " " + birthDate.getDayOfMonth() + "." + birthDate.getMonth() + "." + birthDate.getYear();
    }
}


