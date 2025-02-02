package com.example.springcloudvaultdemo.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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

    @Value("${consul.host}")
    private String consulHost;

    @Value("${consul.port}")
    private String consulPort;

    @PostConstruct
    public void init() {
        log.info("RabbitMQ Host: {}", rabbitmqHost);
        log.info("RabbitMQ Port: {}", rabbitmqPort);
        log.info("Consul host: {}", consulHost);
        log.info("Consul port: {}", consulPort);
    }
}
