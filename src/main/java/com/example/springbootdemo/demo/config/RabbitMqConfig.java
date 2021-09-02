package com.example.springbootdemo.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
//public class RabbitMqConfig {
//
//    @Value("${spring.rabbitmq.template.default-receive-queue}")
//    private String queueName;
//
//    @Value("${spring.rabbitmq.template.exchange}")
//    private String exchangeName;
//
//    @Value("${spring.rabbitmq.template.routing-key}")
//    private String routingName;
//
//    @Bean
//    public Queue directDueue() {
//        return new Queue(queueName, true);
//    }
//
//    @Bean
//    public DirectExchange directExchange() {
//        return new DirectExchange(exchangeName, true, false);
//    }
//
//    //直接绑定交换机和消息队列及路由规则
//    @Bean
//    public Binding binding() {
//        return BindingBuilder.bind(directDueue()).to(directExchange()).with(routingName);
//    }
//
//}
