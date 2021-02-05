package homework.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email extends Message {
    final String emailAddress;
    final String subject;

    public Email(String content) {
        super(content);
        emailAddress = "";
        subject = "";
    }

    public Email(String content, String emailAddress, String subject) {
        super(content);
        this.emailAddress = emailAddress;
        this.subject = subject;
    }
       boolean z;
    //     * - adres mail: brak małpy, pusty łańcuch, null, niewystarczająca długość - co najmniej 5 znaków<br>
    @Override
    public String send() {
        if (emailAddress == null || subject == null || getContent() == null) {
            return "Mail nie może zostać wysłany. Adres, tytuł bądz zawartość jest pusta, proszę o uzupełnienie.";
        }

        if (emailAddress.length() < 5 || subject.length() < 1) {
            return "Mail nie może zostać wysłany. Adres bądz tytuł sa za krótkie.";
        }
        Pattern addres = Pattern.compile(".[A-z0-9]{1,100}+@.+\\.[a-z]{2,5}");
        Matcher givenAddres = addres.matcher(emailAddress);
        boolean aprovalOfAddres = givenAddres.matches();
        if (aprovalOfAddres) {
            return "Mail o tytule " + subject + " i treści " + getContent() + " został wysłany na adres " + emailAddress;
        } else {
            return "Mail nie może zostać wysłany. Podany adress email jest niepoprawny.";
        }
    }
}




//    Pattern addres = Pattern.compile(".*\\s+([0-9a-zA-Z][\\dA-z-_.]+@([A-z\\d][A-z\\d-]+\\.){1,6}[A-z]{2,6}).*");
//    Matcher givenAddres = addres.matcher(emailAddress);
//    boolean aprovalOfAddres = givenAddres.matches();
//        if (aprovalOfAddres = true)