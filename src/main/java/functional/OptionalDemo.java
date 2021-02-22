package functional;

import java.util.Optional;

public class OptionalDemo{
    static public Optional<String> getEmail(String email){
        if (email.contains("@")) {
            return Optional.of(email);
        }
        return Optional.empty();
    }
    public static void main(String[] args) {
        System.out.println(getEmail("aaa.pl"));
        System.out.println(getEmail("aaa.pl").orElse("Niepoprawny Adres"));
       /*
       if (getEmail("aaa.pl") !=null){
            System.out.println(getEmail("aaa.pl").toLowerCase());
        }
        */
    }
}
