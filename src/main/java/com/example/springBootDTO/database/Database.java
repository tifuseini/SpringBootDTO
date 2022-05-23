package com.example.springBootDTO.database;

import com.example.springBootDTO.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Database {

    @Autowired
    private UserRepository userRepository;

    @Autowired
}
