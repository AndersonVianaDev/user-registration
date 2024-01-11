package com.anderson.msuser.services;

import com.anderson.msuser.dtos.RegisterDTO;
import com.anderson.msuser.entities.User;
import com.anderson.msuser.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(RegisterDTO data) {
        var user = new User(data);
        this.userRepository.save(user);
    }

}
