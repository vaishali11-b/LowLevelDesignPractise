package senderFactory;

import channel.Channel;
import sender.*;

import java.util.*;

public class DefaultNotificationSenderFactory implements NotificationSenderFactory{
    private final Map<Channel , NotificationSender> senderMap;
    private final Map<Channel , SchedulableNotificationSender> schedulableSenderMap;

    public DefaultNotificationSenderFactory(){
        this.senderMap = new HashMap<>();
        this.schedulableSenderMap = new HashMap<>();

        EmailNotificationSender emailNotification = new EmailNotificationSender();
        SMSNotificationSender smsNotification = new SMSNotificationSender();
        PushNotificationSender pushNotification = new PushNotificationSender();

        senderMap.put(Channel.Email , emailNotification);
        senderMap.put(Channel.SMS , smsNotification);
        senderMap.put(Channel.Push , pushNotification);
        
        schedulableSenderMap.put(Channel.Email , emailNotification);
        schedulableSenderMap.put(Channel.SMS , smsNotification);
        schedulableSenderMap.put(Channel.Push , pushNotification);

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
