package com.OpmBackendApplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.OpmBackendApplication.model.Image;

@Component
@CrossOrigin (origins = "http://localhost:4200")
@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
	Optional<Image> findByName(String name);
}