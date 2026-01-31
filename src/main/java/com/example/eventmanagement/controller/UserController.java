package com.example.eventmanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventmanagement.entity.User;
import com.example.eventmanagement.service.UserService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RequestMapping("api/user")
@RestController
public class UserController {

    UserService userService;

    UserController(UserService userService ){
        this.userService = userService;
    }
    @PostMapping
    public ResponseEntity<User> register(@RequestBody User user) {
        //TODO: process POST request
        User savedUser = userService.registerUser(user);
        return ResponseEntity.ok(savedUser);
    }
    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(userService.getAllUser());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getMethodName(@RequestParam Integer id) {
        User user = userService.findUserById(id);
        if(user == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable Integer id, @RequestBody User updatedUser) {
        //TODO: process PUT request
        
        User user = userService.updateUser(id, updatedUser);
        if(user == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

    @DeleteMapping
    public ResponseEntity<Void> delUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return ResponseEntity.notFound().build();

    }
    

    
    
   
}
