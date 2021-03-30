package com.akinkemer.manport.dto;

import com.akinkemer.manport.enums.app.*;
import com.google.gson.Gson;

import java.util.Date;
import java.util.List;

public class ApplicationDto {
    private long id;
    private String name;
    private boolean lineStopRisk;
    private String businessArea;
    private String shortCode;
    private String responsibleName;
    private Integer lineCountOfBackendCode;
    private Integer lineCountOfFrontendCode;
    private Date releaseDate;
    private String responsibleTeam;
    private String backend;
    private String frontend;
    private String database;
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
    public String getResponsibleTeam() {
        return responsibleTeam;
    }
    public void setResponsibleTeam(String responsibleTeam) {
        this.responsibleTeam = responsibleTeam;
    }
    public String getBackend() {
        return backend;
    }
    public void setBackend(String backend) {
        this.backend = backend;
    }
    public String getFrontend() {
        return frontend;
    }
    public void setFrontend(String frontend) {
        this.frontend = frontend;
    }
    public String getDatabase() {
        return database;
    }
    public void setDatabase(String database) {
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
    public String getBusinessArea() {
        return businessArea;
    }
    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea;
    }

    public ApplicationDto(
            long id,
            String name,
            boolean lineStopRisk,
            String businessArea,
            String shortCode,
            String responsibleName,
            Integer lineCountOfBackendCode,
            Integer lineCountOfFrontendCode,
            Date releaseDate,
            String responsibleTeam,
            String backend,
            String frontend,
            String database,
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
    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
