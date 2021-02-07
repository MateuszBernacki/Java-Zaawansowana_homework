package inner;

public class HumanBodyDemo {
    public static void main(String[] args) {
        HumanBody body = new HumanBody();
        HumanBody.Heart heart = body.new Heart(68);
        body.setHeart(heart);
        System.out.println(heart);
        System.out.println(body);
    }
}
