package com.akinkemer.manport.converter;

import com.akinkemer.manport.domain.Job;
import com.akinkemer.manport.dto.JobDto;

public class DtoToJobConverter implements GenericDtoConverter<JobDto, Job>{
    @Override
    public Job apply(JobDto dto) {
        return new Job(
                dto.getName(),
                dto.getImpactStatus(),
                dto.getProduction(),
                dto.getApplication()
        );
    }
}
