package com.akinkemer.manport.converter;

import com.akinkemer.manport.domain.Application;
import com.akinkemer.manport.dto.ApplicationDto;
import com.akinkemer.manport.enums.app.*;

public class DtoToApplicationConverter implements GenericDtoConverter<ApplicationDto, Application>
{
    @Override
    public Application apply(ApplicationDto dto) {

        return new Application(
                dto.getName(),
                dto.getShortCode(),
                dto.getResponsibleName(),
                dto.getLineCountOfBackendCode(),
                dto.getLineCountOfFrontendCode(),
                dto.isLineStopRisk(),
                dto.getReleaseDate(),
                BusinessArea.valueOf(BusinessArea.getEnumByString(dto.getBusinessArea())),
                ResponsibleTeam.valueOf(ResponsibleTeam.getEnumByString(dto.getResponsibleTeam())),
                Backend.valueOf(Backend.getEnumByString(dto.getBackend())),
                Frontend.valueOf(Frontend.getEnumByString(dto.getFrontend())),
                Database.valueOf(Database.getEnumByString(dto.getDatabase())),
                new DtoToJobConverter().convert(dto.getJobs())
        );
    }
}
