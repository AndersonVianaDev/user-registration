package com.anderson.msuser.services;

import com.anderson.msuser.dtos.RegisterDTO;
import com.anderson.msuser.entities.User;
import com.anderson.msuser.producers.UserProducer;
import com.anderson.msuser.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final UserProducer userProducer;

    public UserService(UserRepository userRepository, UserProducer userProducer) {
        this.userRepository = userRepository;
        this.userProducer = userProducer;
    }
    @Transactional
    public void createUser(RegisterDTO data) {
        var user = new User(data);
        this.userRepository.save(user);
        this.userProducer.publishMessageEmail(user);
    }

}
