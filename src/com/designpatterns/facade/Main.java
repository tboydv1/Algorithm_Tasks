package com.designpatterns.facade;

public class Main {

    //facade pattern solves coupling problem
    //Facade means front or face.
    //one class that encapsulate complex service
    //Provides a simple interface to a complex system

    public static void main(String[] args) {
        var service = new NotificationService();
        service.send("Hello world", "target");
    }
}
