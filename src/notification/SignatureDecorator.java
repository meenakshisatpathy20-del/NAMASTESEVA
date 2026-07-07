package notification;

public class SignatureDecorator extends NotificationDecorator {

    private String signature;

    public SignatureDecorator(INotification notification,
                              String signature) {

        super(notification);
        this.signature = signature;
    }

    @Override
    public String getContent() {

        return notification.getContent()
                + "\n\n-- "
                + signature;

    }
}