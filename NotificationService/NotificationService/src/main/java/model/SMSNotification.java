package model;

import channel.Channel;

public final class SMSNotification implements Notification{
    private final String contact;
    private final String message;

    public SMSNotification(String contact , String message){
        this.contact = contact;
        this.message = message;
    }

    @Override
    public Channel getChannel(){
        return Channel.SMS;
    }
    @Override
    public String getRecipient(){
        return contact;
    }
    @Override
    public String getContent(){
        return message;
    }
}