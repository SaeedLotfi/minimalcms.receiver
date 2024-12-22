package com.saeed.minimalcms.receiver.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Receiver {
    @JmsListener(destination = "${springjms.cs544queue}")
    public void receive(Map<String, Object> message) {
        System.out.println("Received: " + message);
    }
}
