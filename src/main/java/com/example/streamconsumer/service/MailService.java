package com.example.streamconsumer.service;

import javax.mail.MessagingException;

public interface MailService {

    void enviarEmailSimples(String para, String assunto, String conteudo, String... copia);

    void enviarEmailComAnexo(String para, String assunto, String conteudo, String caminhoArquivo, String... copia) throws MessagingException;
    
}