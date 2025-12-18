package SPRING.loose;

public class TightCouplingExample {
    public static void main(String[] args) {
        UserManager usm = new UserManager();
        System.out.println(usm.userInfo());
    }
}
