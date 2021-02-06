package hermetyzation;

public class SuperHackerHermesBank extends HermesBank {
    //Nadpisujemy metode aby doprowadzic do ujemnego stanu konta
    @Override
    public String debit(int amount) {
        balance -= amount;
        return "yes";
    }
}
