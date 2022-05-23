package com.example.springBootDTO.database;

import com.example.springBootDTO.model.Location;
import com.example.springBootDTO.model.User;
import com.example.springBootDTO.repositories.LocationRepository;
import com.example.springBootDTO.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Database {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LocationRepository locationRepository;


    public void run(String... args) throws Exception{

        Location location = new Location();
        location.setPlace("Accra");
        location.setDescription("Accra is expensive to live");
        location.setLongitude(30.89);
        location.setLatitude(40.09);
        locationRepository.save(location);

        User user1 = new User;
        user1.setFirstName("Tahiru");
        user1.setLastName("Iddrisu");
        user1.setEmail("tahiru@outlook.com");
        user1.setPassword("secret");
        user1.setLocation(location);

        User user2 = new User();
        user2.setFirstName("Tahiru");
        user2.setLastName("Iddrisu");
        user2.
    }
}
