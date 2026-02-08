package senderFactory;

import channel.Channel;
import sender.NotificationSender;
import sender.SchedulableNotificationSender;
import java.util.Optional;
public interface NotificationSenderFactory {

    Optional<NotificationSender> getSender(Channel channel);
    Optional<SchedulableNotificationSender> getSchedulableSender(Channel channel);

    }

