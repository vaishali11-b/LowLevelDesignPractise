package com.example.eventmanagement.service;

import com.example.eventmanagement.repository.UserRepository;

import java.util.List;

import com.example.eventmanagement.entity.User;
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User registerUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public User findUserById(Integer id){
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(Integer id , User updatedUser){
        return userRepository.findById(id).map(user ->{
            user.setName(updatedUser.getName());
            user.setPassword(updatedUser.getPassword());
            return userRepository.save(user);
    }).orElse(null);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    

}
