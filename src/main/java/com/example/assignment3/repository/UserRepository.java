package com.example.assignment3.repository;

import com.example.assignment3.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
