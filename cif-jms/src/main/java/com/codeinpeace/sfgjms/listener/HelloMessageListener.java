package com.codeinpeace.sfgjms.listener;

import com.codeinpeace.sfgjms.config.JmsConfig;
import com.codeinpeace.sfgjms.model.HelloWorldMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class HelloMessageListener {

    private final JmsTemplate jmsTemplate;

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers, Message message){

        System.out.println("I Got a Message!!!!!");

        System.out.println(helloWorldMessage);

        // uncomment and view to see retry count in debugger
        // throw new RuntimeException("foo");
    }

    @JmsListener(destination = JmsConfig.MY_SEND_RCV_QUEUE)
    public void listenForHello(@Payload HelloWorldMessage helloWorldMessage,
                               @Headers MessageHeaders headers, Message jmsMessage,
                               org.springframework.messaging.Message springMessage) throws JMSException {

        HelloWorldMessage payloadMsg = HelloWorldMessage
                .builder()
                .id(UUID.randomUUID())
                .message("World!!")
                .build();

        jmsTemplate.convertAndSend(jmsMessage.getJMSReplyTo(), payloadMsg);

    }
}
