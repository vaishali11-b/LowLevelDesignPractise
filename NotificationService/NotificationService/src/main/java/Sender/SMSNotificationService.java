package sender;

import model.Notification;
import java.time.LocalDateTime;


public class SMSNotificationService implements ScheduledNotificationSender {
    @Override
    public void send(Notification notification){
        System.out.println("Sending SMS to " + notification.getRecipient());
    }
    @Override
    public void schedule(Notification notification , LocalDateTime localDateTime){
        System.out.println("Sending SMS to " + notification.getRecipient()+ "at" + localDateTime);
    }
}
