package com.akinkemer.manport.converter;

import com.akinkemer.manport.domain.Production;
import com.akinkemer.manport.dto.ProductionDto;

public class ProductionToDtoConverter implements GenericDtoConverter<Production, ProductionDto> {
    @Override
    public ProductionDto apply(Production entity) {
        JobDtoToConverter jobDtoConverter=new JobDtoToConverter();
        return new ProductionDto(
                entity.getId(),
                jobDtoConverter.convert(entity.getJobs()));
    }
}
