package com.example.springcloudvaultdemo.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mahfuz.ahmed
 * @since 1/28/25
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class RabbitMQService {

    @Value("${spring.rabbitmq.host}")
    private String rabbitmqHost;

    @Value("${spring.rabbitmq.port}")
    private Integer rabbitmqPort;

    @Value("${spring.rabbitmq.username}")
    private String rabbitmqUsername;

    @Value("${spring.rabbitmq.password}")
    private String rabbitmqPassword;

    @Value("${spring.rabbitmq.virtual-host}")
    private String rabbitmqVirtualHost;

    private final RabbitTemplate rabbitTemplate;

    @PostConstruct
    public void init() {
        log.info("RabbitMQ Host: {}", rabbitmqHost);
        log.info("RabbitMQ Port: {}", rabbitmqPort);

        rabbitTemplate.convertAndSend("x.test", "test.rk", "Hello world");

        log.info("Sent data");
    }
}
