package com.amolsoftwares.usermanagement.service.impl;

import com.amolsoftwares.usermanagement.entity.User;
import com.amolsoftwares.usermanagement.repository.UserRepository;
import com.amolsoftwares.usermanagement.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        User saveUser = userRepository.save(user);
        return saveUser;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String id) {
        Optional<User> userById = userRepository.findById(id);
        return userById.orElse(null);
    }

    @Override
    public User updateUserById(User user) {
        return null;
    }

    @Override
    public void deleteUserById(String id) {

    }
}
