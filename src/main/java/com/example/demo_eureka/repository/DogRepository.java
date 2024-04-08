package com.example.demo_eureka.repository;

import com.example.demo_eureka.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {

}
