package com.estudos.ConsumindoProduzindoMensagensComSqs.producer;

import com.estudos.ConsumindoProduzindoMensagensComSqs.consumer.MyMessage;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyProducer {

    @Autowired
    SqsTemplate sqsTemplate;
    public void enviarMesagem(){
        var SQS = "https://localhost.localstack.cloud:4566/000000000000/minha-fila";
        sqsTemplate.send(SQS , "{ 'context': 'meu valor de start' ");
    }
}
