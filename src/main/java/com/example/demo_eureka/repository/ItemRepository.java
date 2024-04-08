package com.example.demo_eureka.repository;

import com.example.demo_eureka.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
