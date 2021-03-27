package com.akinkemer.manport.repository;

import com.akinkemer.manport.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
