package com.anderson.msuser.producers;

import com.anderson.msuser.dtos.EmailDTO;
import com.anderson.msuser.entities.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserProducer {

    private final RabbitTemplate rabbitTemplate;

    public UserProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Value("${routing.key}")
    private String routingKey;

    public void publishMessageEmail(User user) {
        String subject = "Registration completed successfully!";
        String text = user.getName() + ", welcome ! Take advantage of our platform!";

        var emailDTO = new EmailDTO(user.getId(), user.getEmail(), subject, text);

        rabbitTemplate.convertAndSend("", routingKey, emailDTO);
    }
}
