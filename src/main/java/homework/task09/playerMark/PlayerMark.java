package homework.task09.playerMark;

public class PlayerMark {
    private final String name;
    private final String symbol;
    public PlayerMark(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}