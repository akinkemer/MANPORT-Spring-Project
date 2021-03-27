package com.akinkemer.manport.converter;

import com.akinkemer.manport.domain.Country;
import com.akinkemer.manport.dto.CountryDto;

public class CountryDtoConverter implements GenericDtoConverter<Country, com.akinkemer.manport.dto.CountryDto> {
    @Override
    public com.akinkemer.manport.dto.CountryDto apply(Country entity) {
        ProductionDtoConverter productionDtoConverter=new ProductionDtoConverter();
        return new CountryDto(
                entity.getId(),
                entity.getShortCode(),
                entity.getFullName(),
                productionDtoConverter.convert(entity.getProductions())
        );
    }
}