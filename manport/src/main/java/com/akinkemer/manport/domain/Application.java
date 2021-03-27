package com.akinkemer.manport.domain;

import com.akinkemer.manport.enums.app.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Application extends BaseEntity {

    @NotBlank
    @Size(max = 40)
    private String name;

    @NotBlank
    @Size(max = 10)
    private String shortCode;

    @Size(max = 40)
    private String responsibleName;

    @Range(min = 1)
    private Integer lineCountOfBackendCode;

    @Range(min = 1)
    private Integer lineCountOfFrontendCode;

    private boolean lineStopRisk = false;

    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @Enumerated(EnumType.STRING)
    private BusinessArea businessArea = BusinessArea.OTHER;

    @Enumerated(EnumType.STRING)
    private ResponsibleTeam responsibleTeam = ResponsibleTeam.OTHER;

    @Enumerated(EnumType.STRING)
    private Backend backend = Backend.OTHER;

    @Enumerated(EnumType.STRING)
    private Frontend frontend = Frontend.OTHER;

    @Enumerated(EnumType.STRING)
    private Database database = Database.OTHER;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    List<Job> jobs = new ArrayList<>();


    public Application() {
    }

    public Application(
            @NotBlank @Size(max = 40) String name,
            @NotBlank @Size(max = 10) String shortCode,
            @Size(max = 40) String responsibleName,
            @Range(min = 1) Integer lineCountOfBackendCode,
            @Range(min = 1) Integer lineCountOfFrontendCode,
            boolean lineStopRisk,
            Date releaseDate,
            BusinessArea businessArea,
            ResponsibleTeam responsibleTeam,
            Backend backend,
            Frontend frontend,
            Database database,
            List<Job> jobs
    ) {
        this.name = name;
        this.shortCode = shortCode;
        this.responsibleName = responsibleName;
        this.lineCountOfBackendCode = lineCountOfBackendCode;
        this.lineCountOfFrontendCode = lineCountOfFrontendCode;
        this.lineStopRisk = lineStopRisk;
        this.releaseDate = releaseDate;
        this.businessArea = businessArea;
        this.responsibleTeam = responsibleTeam;
        this.backend = backend;
        this.frontend = frontend;
        this.database = database;
        this.jobs = jobs;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public Integer getLineCountOfBackendCode() {
        return lineCountOfBackendCode;
    }

    public void setLineCountOfBackendCode(Integer lineCountOfBackendCode) {
        this.lineCountOfBackendCode = lineCountOfBackendCode;
    }

    public Integer getLineCountOfFrontendCode() {
        return lineCountOfFrontendCode;
    }

    public void setLineCountOfFrontendCode(Integer lineCountOfFrontendCode) {
        this.lineCountOfFrontendCode = lineCountOfFrontendCode;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ResponsibleTeam getResponsibleTeam() {
        return responsibleTeam;
    }

    public void setResponsibleTeam(ResponsibleTeam responsibleTeam) {
        this.responsibleTeam = responsibleTeam;
    }

    public Backend getBackend() {
        return backend;
    }

    public void setBackend(Backend backend) {
        this.backend = backend;
    }

    public Frontend getFrontend() {
        return frontend;
    }

    public void setFrontend(Frontend frontend) {
        this.frontend = frontend;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public Long getId() {
        return super.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLineStopRisk() {
        return lineStopRisk;
    }

    public void setLineStopRisk(boolean lineStopRisk) {
        this.lineStopRisk = lineStopRisk;
    }

    public BusinessArea getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(BusinessArea businessArea) {
        this.businessArea = businessArea;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
