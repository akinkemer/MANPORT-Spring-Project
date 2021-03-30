package com.akinkemer.manport.converter;

import com.akinkemer.manport.domain.Application;
import com.akinkemer.manport.dto.ApplicationDto;
import com.akinkemer.manport.enums.app.*;

public class ApplicationToDtoConverter implements GenericDtoConverter<Application, ApplicationDto> {
    @Override
    public ApplicationDto apply(Application entity) {
        JobDtoToConverter jobDtoConverter=new JobDtoToConverter();
        return new ApplicationDto(
                entity.getId(),
                entity.getName(),
                entity.isLineStopRisk(),
                BusinessArea.getEnumByString(entity.getBusinessArea().toString()),
                entity.getShortCode(),
                entity.getResponsibleName(),
                entity.getLineCountOfBackendCode(),
                entity.getLineCountOfFrontendCode(),
                entity.getReleaseDate(),
                entity.getResponsibleTeam().toString(),
                entity.getBackend().toString(),
                entity.getFrontend().toString(),
                entity.getDatabase().toString(),
                jobDtoConverter.convert(entity.getJobs()));
    }
}
