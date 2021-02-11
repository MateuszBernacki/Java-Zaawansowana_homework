package homework.task6;
// * 1. Klasa EmailAddress przechowująca poprawny adres email (jedna @, co najmniej jedna kropka za @, tylko znaki alfanumeryczne)
//        *    z metodami zwracającymi cały adres i składowe adresu:
//        *    - get() - zwraca cały adres
//        *    - username() - ciąg znaków przed @
// *    - host() - ciąg znaków za @
// *    - topDomain() - najwyższą domenę, czyli ciąg znaków za ostanią kropką


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {
final public String emailAdres;

    private EmailAddress(String emailAdres) {
        this.emailAdres = emailAdres;
    }

    public static EmailAddress of(String emailAdres) {
        Pattern addres = Pattern.compile(".[A-z0-9]{1,100}+@.+\\.[a-z]{2,5}");
        Matcher givenAddres = addres.matcher(emailAdres);
        boolean aprovalOfAddres = givenAddres.matches();
        if (aprovalOfAddres) {
            return new EmailAddress(emailAdres);
        } else
            return null;
    }

    public String get() {
        return emailAdres;
    }

    public String username() {
        return (String) emailAdres.subSequence(0, emailAdres.lastIndexOf("@"));
    }

    public String host() {
        int n = emailAdres.lastIndexOf("@");
        return (String) emailAdres.substring(n + 1);
    }

    public String topDomain() {
        int n = emailAdres.lastIndexOf(".");
        return (String) emailAdres.substring(n + 1);
    }

    @Override
    public String toString() {
        return "EmailAddress " + emailAdres;
    }
}
