package com.designpatterns.facade;

public class NotificationService {

    public void send(String content, String target){
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appID", "key");
        var message = new Message(content);
        server.send(authToken, message, target);
        connection.disconnect();
    }
}
