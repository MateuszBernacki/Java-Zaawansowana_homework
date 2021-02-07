package anonymous;

public class MenuItem  {

        final String LABEL;
        final int NUMBER;

    public MenuItem(String label, int number) {
        this.LABEL = label;
        this.NUMBER = number;
    }

    public String getLABEL() {
        return LABEL;
    }

    public int getNUMBER() {
        return NUMBER;
    }
}
