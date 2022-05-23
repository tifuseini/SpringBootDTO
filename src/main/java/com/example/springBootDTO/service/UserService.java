package com.example.springBootDTO.service;

import com.example.springBootDTO.dto.UserLocationDTO;
import com.example.springBootDTO.model.User;
import com.example.springBootDTO.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUsersLocation(){
        return userRepository.findAll()
                .stream()
                .map(this::covertEntityToDto)
                .collect(Collectors.toList());
    }

    private <UserLocationDTO>  covertEntityToDto(User user) {
        UserLocationDTO userLocationDTO  =new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());

        return;userLocationDTO;
    }




}
