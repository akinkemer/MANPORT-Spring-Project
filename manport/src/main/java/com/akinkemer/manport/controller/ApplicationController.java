package com.akinkemer.manport.controller;

import com.akinkemer.manport.domain.Application;
import com.akinkemer.manport.dto.ApplicationDto;
import com.akinkemer.manport.service.ApplicationService;
import com.akinkemer.manport.service.ApplicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/applications")
public class ApplicationController {
    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    public List<ApplicationDto> getApplications() {
        return applicationService.getApplications();
    }

    @PostMapping
    public void addNewApplication(@RequestBody Application application) {
        applicationService.addNewApplication(application);
    }
}
