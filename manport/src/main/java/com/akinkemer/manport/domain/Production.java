package com.akinkemer.manport.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Production extends BaseEntity {

    @ManyToOne(
            fetch = FetchType.EAGER
    )
    @JsonBackReference
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany(
            orphanRemoval = true,
            cascade = CascadeType.ALL
    )
    private List<Job> jobs;

    public Long getId() {
        return super.getId();
    }

    public Country getCountry() {
        return country;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Production() {
    }

    public Production(List<Job> jobs) {
        this.jobs = jobs;
    }
}
