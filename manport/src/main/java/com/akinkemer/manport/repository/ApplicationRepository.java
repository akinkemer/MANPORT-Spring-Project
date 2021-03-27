package com.akinkemer.manport.repository;

import com.akinkemer.manport.domain.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    Optional<Application> findByName(String name);
    Optional<Application> findByShortCode(String shortCode);
}
