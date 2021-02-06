package hermetyzation;

public class HermesBank extends Bank {

    protected int balance;

    @Override
    public String credit(int amount) {
        if (amount < 0){
            return "NO";
        }
        balance+= amount;
        return "yes";
    }

    @Override
    public String debit(int amount) {
        if (amount < 0 || balance <0) {
            return "NO";
        }
        balance -= amount;
        return "yes";
    }

    @Override
    public int balance() {
        return balance;
    }
}
