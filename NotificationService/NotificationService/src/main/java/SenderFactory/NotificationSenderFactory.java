public interface NotificationSenderFactory {

    Optional<NotificationSender> getSender(Channel channel);
    Optional<SchedulableNotificationSender> getSchedulableSender(Channel channel);

    }
}
