package com.akinkemer.manport.service;

import com.akinkemer.manport.converter.DtoToApplicationConverter;
import com.akinkemer.manport.domain.Application;
import com.akinkemer.manport.dto.ApplicationDto;
import com.akinkemer.manport.converter.ApplicationToDtoConverter;
import com.akinkemer.manport.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    private final ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @Override
    public List<ApplicationDto> getApplications(){
        return new ApplicationToDtoConverter()
                .convert(applicationRepository.findAll());
    }

    @Override
    public ApplicationDto addNewApplication(ApplicationDto dto)  {
        Optional<Application> optionalApplication=
                applicationRepository.findByName(dto.getName());
        if(optionalApplication.isPresent())
            throw new IllegalArgumentException("App name taken");
        optionalApplication=
                applicationRepository.findByShortCode(dto.getShortCode());
        if(optionalApplication.isPresent())
            throw new IllegalArgumentException("Short code taken");

        Application app= new DtoToApplicationConverter().convert(dto);

        Application savedApp=applicationRepository.save(app);

        return new ApplicationToDtoConverter().convert(savedApp);
    }
}
