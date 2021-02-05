package homework.task2;

public class SMS extends Message{

    final String phoneNumber;

    public SMS(String content) {
        super(content);
        phoneNumber = "";
    }

    public SMS(String content, String phoneNumber) {
        super(content);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String send() {
        if (phoneNumber.length() == 9) return "SMS o treści " +  getContent() + " został wysłany na numer " + phoneNumber;
        else
        return "SMS nie może zostać wysłany.";
    }

}
