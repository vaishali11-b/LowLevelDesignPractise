package model;

import channel.Channel;
public interface Notification {
     Channel getChannel();
     String getRecipient();
     String getContent();
}
