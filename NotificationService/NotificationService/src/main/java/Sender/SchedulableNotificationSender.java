package sender;

import model.Notification;
import java.time.LocalDateTime;

public interface SchedulableNotificationSender extends NotificationSender {
    void schedule(Notification notification, LocalDateTime dateTime);
}
