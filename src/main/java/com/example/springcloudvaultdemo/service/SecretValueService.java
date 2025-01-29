package com.example.springcloudvaultdemo.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mahfuz.ahmed
 * @since 1/28/25
 */
@Component
public class SecretValueService {

    @Value("${rabbitmq.host}")
    private String rabbitmqHost;

    @Value("${rabbitmq.port}")
    private Integer rabbitmqPort;

    @Value("${rabbitmq.username}")
    private String rabbitmqUsername;

    @Value("${rabbitmq.password}")
    private String rabbitmqPassword;

    @Value("${rabbitmq.virtual-host}")
    private String rabbitmqVirtualHost;

    @PostConstruct
    public void init() {
        System.out.println("RabbitMQ Password: " + rabbitmqPassword);
    }
}
