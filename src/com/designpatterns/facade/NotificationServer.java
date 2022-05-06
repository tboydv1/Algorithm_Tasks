package com.designpatterns.facade;

public class NotificationServer {

    //connect(IP)
    //authenticate(appID, key) -> AuthToken
    //send(authToken, message, target)
    //conn.disconnect()

    public Connection connect(String IpAdd){
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key){
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target)
    {
        System.out.println("sending a message");
    }

}
