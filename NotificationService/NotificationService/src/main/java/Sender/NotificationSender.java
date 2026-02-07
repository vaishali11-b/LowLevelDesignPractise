import javax.management.Notification;

public interface NotificationSender{
    void send(Notification notification);
}