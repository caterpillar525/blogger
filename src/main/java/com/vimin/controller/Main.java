package com.vimin.controller;

import com.vimin.ws.client.WebServiceClient;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/config/applicationContext_ws.xml");
        WebServiceClient client = context.getBean(WebServiceClient.class);
        client.simpleSendAndReceive();
        client.customSendAndReceive();
        context.close();
    }
}
