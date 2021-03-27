package com.akinkemer.manport.service;

import com.akinkemer.manport.converter.CountryDtoConverter;
import com.akinkemer.manport.domain.Country;
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
        CountryDtoConverter countryDtoConverter=new CountryDtoConverter();
        return countryDtoConverter.convert(countryRepository.findAll());
    }
}
