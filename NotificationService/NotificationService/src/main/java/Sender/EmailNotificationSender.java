import java.time.LocalDateTime;

import javax.management.Notification;

public class EmailNotificationSender implements ScheduledNotificationSender{

    @Override
    public void send(Notification notification){
        System.out.println("Sending EMAIL to " + notification.getRecipient());
    }
    @Override
    public void schedule(Notification notification , LocalDateTime localDateTime){
        System.out.println("Sending EMAIL to " + notification.getRecipient()+ "at" + localDateTime);
    }

    }

}
