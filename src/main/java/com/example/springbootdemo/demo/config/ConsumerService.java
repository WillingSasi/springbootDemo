package com.example.springbootdemo.demo.config;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ConsumerService {

    @RabbitListener(queues = "xxxxxx")
    public void listenerQueue(String msg, Channel channel, Message message) throws IOException {
        System.out.println(msg);

        try {
            // 框架容器，是否开启手动ack按照框架配置
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (Exception e) {
            e.printStackTrace();
            //丢弃这条消息
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
        }

    }
}
