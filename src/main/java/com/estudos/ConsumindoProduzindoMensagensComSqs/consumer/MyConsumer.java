package com.estudos.ConsumindoProduzindoMensagensComSqs.consumer;


import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyConsumer {


    @SqsListener("minha-fila")
    public void listen(String mensagem){
        System.out.println("Mensagem recebida : " + mensagem);
    }


}
