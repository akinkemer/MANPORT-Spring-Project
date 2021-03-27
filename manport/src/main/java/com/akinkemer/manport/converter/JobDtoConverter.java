package com.akinkemer.manport.converter;

import com.akinkemer.manport.domain.Job;
import com.akinkemer.manport.dto.JobDto;

import java.util.Date;

public class JobDtoConverter implements GenericDtoConverter<Job, JobDto>{
    @Override
    public JobDto apply(Job entity) {
        Date updateTime=entity.getUpdated();
        if(updateTime==null){
            updateTime=entity.getCreated();
        }
        return new JobDto(
                entity.getId(),
                entity.getName(),
                entity.getImpactStatus(),
                updateTime);
    }
}
