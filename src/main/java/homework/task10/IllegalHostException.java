package homework.task10;

public class IllegalHostException extends Exception{
    private static final String DESOULT_MESAGE = "Komunikat stały";
    private final String host;

    public IllegalHostException(String host, String message) {
        super(message);
        this.host = host;
    }

    public IllegalHostException() {
        super(DESOULT_MESAGE);
        this.host = null;
    }

    public String getHost() {
        return host;
    }
}
