package observer;


import notificationstrategy.NotificationStrategy;

public class NotificationEngine {

    private NotificationStrategy notificationStrategy;

    public NotificationEngine(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void setNotificationStrategy(
            NotificationStrategy notificationStrategy) {

        this.notificationStrategy = notificationStrategy;
    }

    public void sendNotification(String message) {

        if (notificationStrategy == null) {
            Logger.getInstance()
                    .log("Notification failed: No notification strategy selected.");

            return;
        }

        Logger.getInstance()
                .log("Sending notification.");

        notificationStrategy.send(message);

        Logger.getInstance()
                .log("Notification sent successfully.");
    }
}