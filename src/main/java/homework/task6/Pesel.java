package homework.task6;
//3. Klasa Pesel przechowująca poprawny nr pesel (11 cyfr, poprawna data urodzin, poprawna cyfra kontrolna)
//        *    metody:
//        *    - birthDate() - zwraca datę urodzin zawarta w peselu
//        *    - get() - zwraca łańcuch z peselem
//        *    - isMale() - zwraca tru jeśli osoba jest mężczyzną
//        *    - isFemale() - zwraca true jeśli osoba jest kobietą


import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pesel {
    final String pesel;
    private LocalDate date;

    public Pesel(String pesel) {
        this.pesel = pesel;
    }


    public static Pesel of(String pesel){
        Pattern addres = Pattern.compile("[0-9]{11}");
        Matcher givenPesel = addres.matcher(pesel);
        boolean aprovalOfPesel = givenPesel.matches();
        if (aprovalOfPesel) {
            return new Pesel(pesel);
        } else
            return null;
    }
    public String birthDate(){
        String y = pesel.substring(0, 2);
        String m = pesel.substring(2, 4);
        String d = pesel.substring(4, 6);
        int year = Integer.parseInt(y);
        int month = Integer.parseInt(m);
        int day = Integer.parseInt(d);
        year += 1900;
        LocalDate date = LocalDate.of(year, month, day);

        return "Birth date: " + date;
    }
    public String get(){
        return pesel;
    }
    public boolean isMale(){
        String y = pesel.substring(10);
        int male = Integer.parseInt(y);
        return male % 2 != 0;
    }
    public boolean isfemale(){
        String y = pesel.substring(10);
        int female = Integer.parseInt(y);
        return female % 2 == 0;
    }


    @Override
    public String toString() {
        return "Pesel " +
                 pesel;
    }
}
