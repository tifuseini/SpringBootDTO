package com.example.springBootDTO;

import com.example.springBootDTO.model.Location;
import com.example.springBootDTO.model.User;
import com.example.springBootDTO.repositories.LocationRepository;
import com.example.springBootDTO.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDtoApplication.class, args);
	}

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

		User user1 = new User();
		user1.setFirstName("Tahiru");
		user1.setLastName("Iddrisu");
		user1.setEmail("tahiru@outlook.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Tahiru");
		user2.setLastName("Iddrisu");
		user2.setEmail("tahiru@outlook.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);
	}

}
