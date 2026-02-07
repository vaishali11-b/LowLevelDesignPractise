import java.security.Timestamp;

import javax.management.Notification;

public interface SchedulableNotificationSender extends NotificationSender {
    void schedule(Notification notification, LocalDateTime dateTime);
}
