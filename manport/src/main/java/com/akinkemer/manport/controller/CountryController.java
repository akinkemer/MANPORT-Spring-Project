package com.akinkemer.manport.controller;

import com.akinkemer.manport.domain.Country;
import com.akinkemer.manport.dto.CountryDto;
import com.akinkemer.manport.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/countries")
public class CountryController {
    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService){
        this.countryService=countryService;
    }

    @GetMapping
    public List<CountryDto> getApplications() {
        return countryService.getCountries();
    }

}
