package SPRING.tight;

public class UserManager {
    private UserdataBase usb = new UserdataBase();
    // here usermanager is tightly coupled with userdataBase because if we change the database the whole code have to change.
    public String userInfo(){
       return usb.getUserdetail();
    }
}
