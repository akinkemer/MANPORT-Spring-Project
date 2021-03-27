package com.akinkemer.manport.dto;

import com.akinkemer.manport.enums.job.JobStatus;

import java.util.Date;

public class JobDto {
    private long id;
    private String name;
    private JobStatus impactStatus;
    private Date updated;


    public JobDto(long id,
                  String name,
                  JobStatus impactStatus,
                  Date updated) {
        this.id = id;
        this.name = name;
        this.impactStatus = impactStatus;
        this.updated = updated;
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

}
