package com.akinkemer.manport.service;

import com.akinkemer.manport.converter.CountryToDtoConverter;
import com.akinkemer.manport.dto.CountryDto;
import com.akinkemer.manport.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<CountryDto> getCountries(){
        CountryToDtoConverter countryDtoConverter=new CountryToDtoConverter();
        return countryDtoConverter.convert(countryRepository.findAll());
    }
}
