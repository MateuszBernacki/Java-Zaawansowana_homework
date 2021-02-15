package homework.task09.playerMark;

public class PlayerMark {
     final public String name;
     final public String symbol;

        private PlayerMark(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
}

    public static PlayerMark of(String name, String symbol){
    return new PlayerMark(name,symbol);
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