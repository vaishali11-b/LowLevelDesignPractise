public class NotificationService {

    public static void main(String[] args){
        NotificationSenderFactory factory = new DefaultNotificationSenderFactory();
        NotificationDispatcher dispatcher = new NotificationDispatcher(factory);

        Notification email = new EmailNotification("user@example.com", "Hello!", "Welcome");
        dispatcher.dispatch(email);
        dispatcher.schedule(email, LocalDateTime.now().plusHours(2));

        Notification sms = new SMSNotification("7247425697", "Hello!");
        dispatcher.dispatch(sms);
        dispatcher.schedule(sms, LocalDateTime.now().plusHours(3));
    }
    
}
