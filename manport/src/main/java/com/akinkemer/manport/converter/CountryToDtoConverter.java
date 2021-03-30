package com.akinkemer.manport.converter;

import com.akinkemer.manport.domain.Country;
import com.akinkemer.manport.dto.CountryDto;

public class CountryToDtoConverter implements GenericDtoConverter<Country, com.akinkemer.manport.dto.CountryDto> {
    @Override
    public com.akinkemer.manport.dto.CountryDto apply(Country entity) {
        ProductionToDtoConverter productionDtoConverter=new ProductionToDtoConverter();
        return new CountryDto(
                entity.getId(),
                entity.getShortCode(),
                entity.getFullName(),
                productionDtoConverter.convert(entity.getProductions())
        );
    }
}