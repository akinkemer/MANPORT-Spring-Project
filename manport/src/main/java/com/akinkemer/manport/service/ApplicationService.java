package com.akinkemer.manport.service;

import com.akinkemer.manport.domain.Application;
import com.akinkemer.manport.dto.ApplicationDto;

import java.util.List;

public interface ApplicationService {

    void addNewApplication(Application application);

    List<ApplicationDto> getApplications();
}

