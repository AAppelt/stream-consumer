package com.example.streamconsumer.service.impl;

import javax.mail.MessagingException;

import com.example.streamconsumer.entity.Usuario;
import com.example.streamconsumer.service.MailService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


@EnableBinding(Sink.class)
public class MailServiceImpl implements MailService {

    private Logger logger = LoggerFactory.getLogger(MailServiceImpl.class);

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;

    Usuario user = new Usuario();
    
    @StreamListener("input")
    public void consumirUsuario(Usuario usuario) {

        user.setId(usuario.getId());
        user.setNome(usuario.getNome());
        user.setEmail(usuario.getEmail());
        user.setSenha(usuario.getSenha());

        logger.info("Payload Consumido: " + usuario);

        enviarEmailSimples(user.getEmail(), "Bem vindo", "Apriveite a estadia", "");

        

    }

    @Override
    public void enviarEmailSimples(String para, String assunto, String conteudo, String... copia) {
        
        logger.info("Payload Consumido: email: " + user.getEmail() + " nome: " + user.getNome());
        
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(para);
        message.setSubject(assunto);
        message.setText(conteudo);
        // if (ArrayUtil.isNotEmpty(copia)) {
        //     message.setCc(copia);
        // }
        mailSender.send(message);

    }

    @Override
    public void enviarEmailComAnexo(String para, String assunto, String conteudo, String caminhoArquivo,
            String... copia) throws MessagingException {
        // TODO Auto-generated method stub

    }
    
}