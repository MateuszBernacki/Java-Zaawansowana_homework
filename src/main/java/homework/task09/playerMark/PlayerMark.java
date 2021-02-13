package homework.task09.playerMark;

public class PlayerMark {
    static String name;
    static String symbol;
    public PlayerMark(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return symbol;
    }
}