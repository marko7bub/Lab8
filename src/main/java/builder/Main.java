package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().age(18).occupation("SoftServe").gender("m").weight(65).build();
        System.out.println(user);
    }
}
