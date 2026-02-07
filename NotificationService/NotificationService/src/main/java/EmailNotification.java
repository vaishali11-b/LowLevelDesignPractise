import java.nio.channels.Channel;

public final class EmailNotification implements Notification{

    private final String toEmail;
    private final String body;
    private final String subject;

    public EmailNotification(String toEmail , String body , String subject){
        this.toEmail = toEmail;
        this.body = body;
        this.subject = subject;
    }
    @Override
    private getChannel(){
        return Channel.Email;
    }
    @Override
    private String getRecipient(){
        return toEmail;
    }
    @Override
    private String getContent(){
        return body;
    }
    private Strind getSubject(){
        return subject;
    }

}
