package com.example.springBootDTO.repositories;

import com.example.springBootDTO.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
