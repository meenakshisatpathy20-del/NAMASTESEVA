package notification;

public abstract class NotificationDecorator
        implements INotification {

    protected INotification notification;

    public NotificationDecorator(
            INotification notification) {

        this.notification = notification;
    }
}