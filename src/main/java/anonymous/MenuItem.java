package anonymous;

public class MenuItem  {

        final String LABEL;
        final int NUMBER;
        Callback callback;

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

    public void setCallback(Callback callback) {
        this.callback = callback;
    }
    public void process(){
        if (callback != null){
            callback.action();
        }
    }
}
