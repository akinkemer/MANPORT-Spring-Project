package com.akinkemer.manport.domain;

import com.akinkemer.manport.enums.job.JobStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Job extends BaseEntity {

    @Size(max = 40)
    private String name;

    @Enumerated(EnumType.STRING)
    private JobStatus impactStatus = JobStatus.ZERO;

    private Date created;

    private Date updated;


    @ManyToOne(
            fetch = FetchType.EAGER
    )
    private Production production;


    @ManyToOne(
            fetch = FetchType.EAGER
    )
    private Application application;


    @PrePersist
    protected void onCreate() {
        created = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updated = new Date();
    }

    public Job() {
    }

    public Job(@Size(max = 40) String name,
               JobStatus impactStatus) {
        this.name = name;
        this.impactStatus = impactStatus;
    }

    public Job(@Size(max = 40) String name,
               JobStatus impactStatus,
               Production production,
               Application application) {
        this.name = name;
        this.impactStatus = impactStatus;
        this.production = production;
        this.application = application;
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

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Production getProduction() {
        return production;
    }

    public void setProduction(Production production) {
        this.production = production;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public Date getCreated() {
        return created;
    }

    public Date getUpdated() {
        return updated;
    }

}
