package com.example.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eventmanagement.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
