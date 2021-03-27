package com.akinkemer.manport.dto;

import com.akinkemer.manport.domain.Job;
import com.akinkemer.manport.enums.app.*;

import java.util.Date;
import java.util.List;

public class ApplicationDto {
    private long id;
    private String name;
    private boolean lineStopRisk;
    private BusinessArea businessArea;
    private String shortCode;
    private String responsibleName;
    private Integer lineCountOfBackendCode;
    private Integer lineCountOfFrontendCode;
    private Date releaseDate;
    private ResponsibleTeam responsibleTeam;
    private Backend backend;
    private Frontend frontend;
    private Database database;
    private List<JobDto> jobs;

    public List<JobDto> getJobs() {
        return jobs;
    }
    public void setJobs(List<JobDto> jobs) {
        this.jobs = jobs;
    }
    public String getShortCode() {
        return shortCode;
    }
    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
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

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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

    public ApplicationDto(
            long id,
            String name,
            boolean lineStopRisk,
            BusinessArea businessArea,
            String shortCode,
            String responsibleName,
            Integer lineCountOfBackendCode,
            Integer lineCountOfFrontendCode,
            Date releaseDate,
            ResponsibleTeam responsibleTeam,
            Backend backend,
            Frontend frontend,
            Database database,
            List<JobDto> jobs) {
        this.id = id;
        this.name = name;
        this.lineStopRisk = lineStopRisk;
        this.businessArea = businessArea;
        this.shortCode = shortCode;
        this.responsibleName = responsibleName;
        this.lineCountOfBackendCode = lineCountOfBackendCode;
        this.lineCountOfFrontendCode = lineCountOfFrontendCode;
        this.releaseDate = releaseDate;
        this.responsibleTeam = responsibleTeam;
        this.backend = backend;
        this.frontend = frontend;
        this.database = database;
        this.jobs=jobs;
    }
}
