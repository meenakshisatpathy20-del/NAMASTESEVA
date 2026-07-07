package notificationstrategy;

public class EmailStrategy implements NotificationStrategy {

    @Override
    public void send(String message) {

        System.out.println("EMAIL NOTIFICATION");
        System.out.println("Message: " + message);
    }
}