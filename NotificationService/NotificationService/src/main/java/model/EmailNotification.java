package model;

import channel.Channel; 

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
    public Channel getChannel(){
        return Channel.Email;
    }
    @Override
    public String getRecipient(){
        return toEmail;
    }
    @Override
    public String getContent(){
        return body;
    }
    public String getSubject(){
        return subject;
    }

}
