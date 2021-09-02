package com.example.springbootdemo.demo.config;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProduceService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 一对一通信,发送消息
     */
    public void directSend(String messages){
        rabbitTemplate.convertAndSend("queue-only", messages);
    }
}
