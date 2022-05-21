package com.example.springBootDTO.repositories;

import com.example.springBootDTO.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
