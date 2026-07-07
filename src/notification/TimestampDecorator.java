package notification;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampDecorator extends NotificationDecorator {

    public TimestampDecorator(INotification notification) {
        super(notification);
    }

    @Override
    public String getContent() {

        String timestamp =
                LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("dd MMM yyyy | hh:mm a"));

        return "[" + timestamp + "]\n"
                + notification.getContent();
    }
}