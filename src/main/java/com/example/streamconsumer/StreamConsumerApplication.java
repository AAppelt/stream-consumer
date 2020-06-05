package com.example.streamconsumer;

import com.example.streamconsumer.entity.Usuario;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.tomcat.util.json.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class StreamConsumerApplication {

    private Logger logger = LoggerFactory.getLogger(StreamConsumerApplication.class);

    

    //@StreamListener("input")
    public void consumirUsuario(Usuario usuario) {

        // final JavaMailSender sender = null;

        // logger.info("Payload Consumido: email: " + usuario.getEmail() + " nome: " + usuario.getNome());

        // try {

        //     SimpleMailMessage mail = new SimpleMailMessage();
        //     mail.setTo(usuario.getEmail());
        //     mail.setFrom("asdfg@email.com");
        //     mail.setSubject("Email Evento Kafka");
        //     mail.setText("Ola, seja bem vindo");

        //     sender = new JavaMailSender
        //     sender.send(mail);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

    }

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerApplication.class, args);
    }

}
