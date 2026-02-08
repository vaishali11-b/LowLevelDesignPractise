package model;

import channel.Channel;
public final class PushNotification implements Notification{
    private final String devideId;
    private final String title;
    private final String message;

    public PushNotification(String devideId , String message ,String title){
        this.devideId = devideId;
        this.message = message;
        this.title = title;
    }
    @Override
    public Channel getChannel(){
        return Channel.Push;
    }
    @Override
    public String getRecipient(){
        return devideId;
    }
    @Override
    public String getContent(){
        return message;
    }
    public String getTitle(){
        return title;
    }
}