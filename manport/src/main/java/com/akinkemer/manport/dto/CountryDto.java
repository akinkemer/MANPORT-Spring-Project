package com.akinkemer.manport.dto;

import java.util.List;

public class CountryDto {
    private Long id;
    private String shortCode;
    private String fullName;
    private List<ProductionDto> productions;

    public CountryDto(Long id,
                      String shortCode,
                      String fullName,
                      List<ProductionDto> productions) {
        this.id = id;
        this.shortCode = shortCode;
        this.fullName = fullName;
        this.productions = productions;
    }

    public Long getId() {
        return id;
    }

    public String getShortCode() {
        return shortCode;
    }

    public String getFullName() {
        return fullName;
    }

    public List<ProductionDto> getProductions() {
        return productions;
    }
}
