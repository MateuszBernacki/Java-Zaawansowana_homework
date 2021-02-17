package homework.task10;

public class IllegalUsernameException extends Exception{

    private static final String DESOULT_MESAGE = "Komunikat stały";
    private final String username;


    public IllegalUsernameException(String address, String message) {
        super(message);
        this.username = address;
    }

    public IllegalUsernameException() {
        super(DESOULT_MESAGE);
        this.username = null;
    }

    public String getUsername() {
        return username;
    }
}

