package senderfactory;

import channel.NotificationChannel;
import sender.NotificationSender;
import sender.SchedulableNotificationSender;
public interface NotificationSenderFactory {

    Optional<NotificationSender> getSender(Channel channel);
    Optional<SchedulableNotificationSender> getSchedulableSender(Channel channel);

    }

