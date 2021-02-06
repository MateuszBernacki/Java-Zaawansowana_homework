package interfaces;

public class Report implements Printable{
    final String content;

    public Report(String content) {
        this.content = content;
    }


    @Override
    public String print(String device) {
        System.out.println("Print using device "+ device);
        return "raport nr \n" + content;
    }
}
