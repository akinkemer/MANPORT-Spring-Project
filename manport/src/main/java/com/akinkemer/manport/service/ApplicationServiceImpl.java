package com.akinkemer.manport.service;

import com.akinkemer.manport.domain.Application;
import com.akinkemer.manport.dto.ApplicationDto;
import com.akinkemer.manport.converter.ApplicationDtoConverter;
import com.akinkemer.manport.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
        ApplicationDtoConverter appDtoConverter=new ApplicationDtoConverter();
        return appDtoConverter.convert(applicationRepository.findAll());
    }

    @Override
    public void addNewApplication(Application application)  {
        Optional<Application> optionalApplication=applicationRepository.findByName(application.getName());
        if(optionalApplication.isPresent()) throw new IllegalStateException("app name taken");
        optionalApplication=applicationRepository.findByShortCode(application.getShortCode());
        if(optionalApplication.isPresent()) throw new IllegalStateException("short code taken");
        applicationRepository.save(application);
    }
}
