package com.amolsoftwares.usermanagement.service;

import com.amolsoftwares.usermanagement.entity.User;

import java.util.List;

public interface UserService {

    //Create User
    User createUser(User user);

    //Get All Users
    List<User> getAllUsers();

    //Get User By ID
    User getUserById(String id);

    //Update User
    User updateUserById(User user);

    //Delete User
    void deleteUserById(String id);
}
