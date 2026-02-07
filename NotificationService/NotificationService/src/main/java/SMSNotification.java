import java.nio.channels.Channel;

public final class SMSNotification implements Notification{
    private final String contact;
    private final String body;

    SMSNotification(String contact , String body){
        this.contact = contact;
        this.body = body;
    }

    @Override
    public String getChannel(){
        return Channel.SMS;
    }
    @Override
    public String getRecipient(){
        return contact;
    }
    @Override
    public String getContent(){
        return body;
    }
}