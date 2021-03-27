package com.akinkemer.manport.repository;

import com.akinkemer.manport.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

public interface JobRepository extends JpaRepository<Job,Long> {
    Job findByName(String name);

}
