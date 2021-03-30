package com.akinkemer.manport.dto;

import com.akinkemer.manport.domain.Application;
import com.akinkemer.manport.domain.Production;
import com.akinkemer.manport.enums.job.JobStatus;

import java.util.Date;

public class JobDto {
    private long id;
    private String name;
    private JobStatus impactStatus;
    private Date updated;
    private Application application;
    private Production production;

    public JobDto(
            long id,
            String name,
            JobStatus impactStatus,
            Date updated,
            Application application,
            Production production) {
        this.id = id;
        this.name = name;
        this.impactStatus = impactStatus;
        this.updated = updated;
        this.application = application;
        this.production = production;
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

    public JobStatus getImpactStatus() {
        return impactStatus;
    }

    public void setImpactStatus(JobStatus impactStatus) {
        this.impactStatus = impactStatus;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public Production getProduction() {
        return production;
    }

    public void setProduction(Production production) {
        this.production = production;
    }
}
