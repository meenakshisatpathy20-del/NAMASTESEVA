package notificationstrategy;

public class SMSStrategy implements NotificationStrategy {

    @Override
    public void send(String message) {

        System.out.println("SMS NOTIFICATION");
        System.out.println("Message: " + message);
    }
}