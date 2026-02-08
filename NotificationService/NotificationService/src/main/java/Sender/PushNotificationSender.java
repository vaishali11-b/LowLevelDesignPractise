package sender;

import model.Notification;
import java.time.LocalDateTime;

public class PushNotificationSender implements ScheduledNotificationSender{
    @Override
    public void send(Notification notification){
        System.out.println("Sending Push to " + notification.getRecipient());
    }
    @Override
    public void schedule(Notification notification , LocalDateTime localDateTime){
        System.out.println("Sending Push to " + notification.getRecipient()+ "at" + localDateTime);
    }
}
