package com.simform;

public class Client {
    public static void main(String[] args) {
        WebServer server1 = new WebServer();
        server1.setName("Server 1");
        server1.start();
        WebServer server2 = new WebServer();
        server2.setName("Server 2");
        server2.start();
        WebServer server3 = new WebServer();
        server3.setName("Server 3");
        server3.start();
    }
}
