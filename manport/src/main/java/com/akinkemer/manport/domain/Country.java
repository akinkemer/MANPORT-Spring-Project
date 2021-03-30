package com.akinkemer.manport.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@JsonIgnoreProperties(value = {"productions"})
public class Country extends BaseEntity{
    @NotBlank
    @Size(max = 10)
    private String shortCode;

    @NotBlank
    @Size(max = 50)
    private String fullName;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Production> productions;

    public Country() {
    }

    public Country(@NotBlank @Size(max = 10) String shortCode,
                   @NotBlank @Size(max = 50) String fullName) {
        this.shortCode = shortCode;
        this.fullName = fullName;
    }

    public Country(@NotBlank @Size(max = 10) String shortCode,
                   @NotBlank @Size(max = 50) String fullName,
                   List<Production> productions) {
        this.shortCode = shortCode;
        this.fullName = fullName;
        this.productions = productions;
    }
    public Long getId(){
        return super.getId();
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Production> getProductions() {
        return productions;
    }

    public void setProductions(List<Production> productions) {
        this.productions = productions;
    }
}
