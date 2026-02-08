package sender;

import model.Notification;
import java.time.LocalDateTime;

public class EmailNotificationSender implements SchedulableNotificationSender{

    @Override
    public void send(Notification notification){
        System.out.println("Sending EMAIL to " + notification.getRecipient());
    }
    @Override
    public void schedule(Notification notification , LocalDateTime localDateTime){
        System.out.println("Sending EMAIL to " + notification.getRecipient()+ "at" + localDateTime);
    }

    }


