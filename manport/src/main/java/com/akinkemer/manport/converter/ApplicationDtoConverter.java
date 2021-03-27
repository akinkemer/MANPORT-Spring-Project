package com.akinkemer.manport.converter;

import com.akinkemer.manport.domain.Application;
import com.akinkemer.manport.dto.ApplicationDto;

public class ApplicationDtoConverter implements GenericDtoConverter<Application, ApplicationDto> {
    @Override
    public ApplicationDto apply(Application entity) {
        JobDtoConverter jobDtoConverter=new JobDtoConverter();
        return new ApplicationDto(
                entity.getId(),
                entity.getName(),
                entity.isLineStopRisk(),
                entity.getBusinessArea(),
                entity.getShortCode(),
                entity.getResponsibleName(),
                entity.getLineCountOfBackendCode(),
                entity.getLineCountOfFrontendCode(),
                entity.getReleaseDate(),
                entity.getResponsibleTeam(),
                entity.getBackend(),
                entity.getFrontend(),
                entity.getDatabase(),
                jobDtoConverter.convert(entity.getJobs()));
    }
}
