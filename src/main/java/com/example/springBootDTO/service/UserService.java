package com.example.springBootDTO.service;

import com.example.springBootDTO.dto.UserLocationDTO;
import com.example.springBootDTO.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUsersLocation(){
        return userRepository.findAll()
                .stream()
                .map()
    }


}
