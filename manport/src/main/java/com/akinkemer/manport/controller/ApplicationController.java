package com.akinkemer.manport.controller;

import com.akinkemer.manport.dto.ApplicationDto;
import com.akinkemer.manport.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/api/v1/applications", produces = MediaType.APPLICATION_JSON_VALUE)
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

    @PostMapping(path = "/add")
    public ResponseEntity<String> addNewApplication(@RequestBody ApplicationDto dto) {

        ApplicationDto createdApp = applicationService.addNewApplication(dto);

        if (createdApp == null) {
            return ResponseEntity.notFound().build();
        } else {
            String resultJSON =
                    "{\"httpStatus\":\"CREATED\",\"body\":"
                            + createdApp.toString()
                            + "}";
            return new ResponseEntity<>(resultJSON, HttpStatus.CREATED);
        }
    }
}
