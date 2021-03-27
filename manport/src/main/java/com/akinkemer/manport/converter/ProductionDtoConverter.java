package com.akinkemer.manport.converter;

import com.akinkemer.manport.domain.Production;
import com.akinkemer.manport.dto.ProductionDto;

public class ProductionDtoConverter implements GenericDtoConverter<Production, ProductionDto> {
    @Override
    public ProductionDto apply(Production entity) {
        JobDtoConverter jobDtoConverter=new JobDtoConverter();
        return new ProductionDto(
                entity.getId(),
                jobDtoConverter.convert(entity.getJobs()));
    }
}
