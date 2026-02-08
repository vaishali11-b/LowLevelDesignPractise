package dispatcher;

import java.time.LocalDateTime;
import model.Notification;
import sender.NotificationSender;
import sender.SchedulableNotificationSender;
import senderFactory.NotificationSenderFactory;

public class NotificationDispatcher {
    private final NotificationSenderFactory factory;

    public NotificationDispatcher(NotificationSenderFactory factory){
        this.factory = factory;
    }

    public void dispatch(Notification notification){
        factory.getSender(notification.getChannel()).
        ifPresentOrElse(sender -> sender.send(notification) , () -> System.out.println("Unsupported notification channel.")
            );
    }
    public void schedule(Notification notification, LocalDateTime dateTime) {
        factory.getSchedulableSender(notification.getChannel())
            .ifPresentOrElse(
                sender -> sender.schedule(notification, dateTime),
                () -> System.out.println("Scheduling not supported for channel: " + notification.getChannel())
            );
    }
}
