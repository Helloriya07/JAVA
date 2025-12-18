package SPRING.looseCouplingHindi;

public class UserService {
    NotificationService notificationService; // instance of notificationservice

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void notifyUser(String message){
        System.out.println("notify user say hello");
    }
}
