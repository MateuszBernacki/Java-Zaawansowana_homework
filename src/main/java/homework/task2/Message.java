package homework.task2;

import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;

abstract public class Message {
    private final String content;

    public Message(String content) {
        this.content = content;
    }

    abstract public String send();

    public boolean canSend() {
        if (content == null) System.out.println("content jest null");
        assert content != null;
        if (content.equals("\\s")) System.out.println("content nie może być białym znakiem");
        if (content.length() <= 5) System.out.println("content ma mniej niz 5 znaków");

        return false;
    }

    public String getContent() {
        return content;
    }
}
