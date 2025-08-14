package com.goatmanager.modules.users.service.impl;

import com.goatmanager.modules.users.entity.Users;
import com.goatmanager.modules.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<String> getUserName() {
        return userRepository.findByUsername();
    }
}
