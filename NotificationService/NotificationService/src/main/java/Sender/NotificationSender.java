package sender;

import model.Notification;
public interface NotificationSender{
    void send(Notification notification);
}