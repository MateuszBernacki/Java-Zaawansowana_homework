package generics;

public class User extends Person{
    final String email;

    public User(String name, double height, String email) {
        super(name, LocalDate.of(2000, 10, 10), height);
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", email='" + email + '\'' +
                '}';
    }
}
