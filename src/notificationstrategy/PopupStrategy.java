package notificationstrategy;

public class PopupStrategy implements NotificationStrategy {

    @Override
    public void send(String message) {

        System.out.println("POPUP NOTIFICATION");
        System.out.println("Message: " + message);
    }
}