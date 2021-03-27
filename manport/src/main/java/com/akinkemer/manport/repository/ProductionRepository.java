package com.akinkemer.manport.repository;

import com.akinkemer.manport.domain.Production;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductionRepository extends JpaRepository<Production,Long> {
    Production findProductionById(Long id);
}
