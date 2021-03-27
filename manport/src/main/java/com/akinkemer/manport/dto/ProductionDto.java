package com.akinkemer.manport.dto;

import com.akinkemer.manport.domain.Country;
import com.akinkemer.manport.domain.Job;

import java.util.List;

public class ProductionDto {
    private long id;
    private List<JobDto> jobs;

    public ProductionDto(Long id, List<JobDto> jobs) {
        this.id = id;
        this.jobs = jobs;
    }

    public long getId() {
        return id;
    }


    public List<JobDto> getJobs() {
        return jobs;
    }
}
