package com.example.streamconsumer.controller;

import com.example.streamconsumer.entity.Usuario;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

// @EnableBinding(Sink.class)
public class UsuarioConsumer {

    // private Logger logger = LoggerFactory.getLogger(UsuarioConsumer.class);
    
    // @StreamListener("input")
    // public void consumirUsuario(Usuario usuario) {

    //     logger.info("Payload Consumido: " + usuario);

    //     logger.info("Payload Consumido: email: " + usuario.getEmail() + " nome: " + usuario.getNome());

    // }
}