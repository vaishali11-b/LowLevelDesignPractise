package senderFactory;

import channel.Channel;
import sender.*;

import java.util.*;

public class DefaultNotificationSenderFactory implements NotificationSenderFactory{
    private final Map<Channel , NotificationSender> senderMap;
    private final Map<Channel , SchedulableNotificationSender> schedulableSender;

    DefaultNotificationSenderFactory(Map<Channel , NotificationSender> senderMap , Map<Channel , SchedulableNotificationSender> schedulableSender){
        this.senderMap = senderMap;
        this.schedulableSender = schedulableSender;

        EmailNotificationSender emailNotification = new EmailNotificationSender();
        SMSNotificationSender smsNotification = new SMSNotification();
        PushNotificationSender pushNotification = new PushNotificationSender();

        senderMap.put(Email , emailNotification);
        senderMap.put(SMS , smsNotification);
        senderMap.put(Push , pushNotification);
        
        schedulableSender.put(Email , emailNotification);
        schedulableSender.put(SMS , smsNotification);
        schedulableSender.put(Push , pushNotification);

    }
     @Override
    public Optional<NotificationSender> getSender(Channel channel) {
        return Optional.ofNullable(senderMap.get(channel));
    }

    @Override
    public Optional<SchedulableNotificationSender> getSchedulableSender(Channel channel) {
        return Optional.ofNullable(schedulableSenderMap.get(channel));
    }

}
