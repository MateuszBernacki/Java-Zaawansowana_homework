package hermetyzation;

public class HackerBank extends GringotBank {
    @Override
    public String debit(int amount){
        //nie mozna dostac sie do pola balance , bo jest prywatne
        //możemy tylko zasymulować wpłate
        super.debit(amount);
        return "Balance changed";
    }
}
