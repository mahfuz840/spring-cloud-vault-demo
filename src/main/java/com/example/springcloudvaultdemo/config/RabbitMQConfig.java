package com.example.springcloudvaultdemo.config;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mahfuz.ahmed
 * @since 1/28/25
 */
@Configuration
public class RabbitMQConfig {

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

    @Bean
    public ConnectionFactory rabbitConnectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory(
                rabbitmqHost,
                rabbitmqPort
        );
        connectionFactory.setUsername(rabbitmqUsername);
        connectionFactory.setPassword(rabbitmqPassword);
        connectionFactory.setVirtualHost(rabbitmqVirtualHost);
        return connectionFactory;
    }
}
