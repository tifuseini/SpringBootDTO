package com.example.springBootDTO.database;

import com.example.springBootDTO.model.Location;
import com.example.springBootDTO.repositories.LocationRepository;
import com.example.springBootDTO.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Database {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public void run() throws Exception{

        Location location = new Location();
        location.setPlace("Accra");
        location.setDescription("Accra is expensive to live");
        location.setLongitude(30.89);
        location.setLatitude(40.09);
        locationRepository.save(location);
    }
}
