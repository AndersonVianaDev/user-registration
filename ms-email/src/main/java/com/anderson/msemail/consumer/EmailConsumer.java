package com.anderson.msemail.consumer;

import com.anderson.msemail.dtos.EmailDTO;
import com.anderson.msemail.entities.Email;
import com.anderson.msemail.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    private final EmailService emailService;

    public EmailConsumer(EmailService emailService) {
        this.emailService = emailService;
    }
    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailDTO data) {
        var email = new Email(data);
        this.emailService.sendEmail(email);
    }
}
