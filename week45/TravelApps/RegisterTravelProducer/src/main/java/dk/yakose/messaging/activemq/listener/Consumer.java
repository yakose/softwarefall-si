package dk.yakose.messaging.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "registertravel.queue")
    public void consume(String message) {
        System.out.println("Received Message: " + message);
    }
}
