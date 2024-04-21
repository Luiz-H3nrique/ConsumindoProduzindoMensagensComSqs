package com.estudos.ConsumindoProduzindoMensagensComSqs.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.awscore.AwsClient;
import software.amazon.awssdk.services.sqs.SqsAsyncClient;


import java.net.URI;

@Configuration
public class SqsConfig {

    @Bean
    public SqsAsyncClient sqsAsyncClient(){
        return SqsAsyncClient.builder()
                .endpointOverride(
                        URI.create("http://localhost:4566")
                )
                .build();
    }
}