package com.akinkemer.manport.web_socket;

import com.akinkemer.manport.enums.job.JobStatus;

public class Issue {
    private Long appId;
    private Long countryId;
    private Long productionId;
    private Long jobId;
    private JobStatus jobStatus;

    public Long getAppId() {
        return appId;
    }

    public Long getCountryId() {
        return countryId;
    }

    public Long getProductionId() {
        return productionId;
    }

    public Long getJobId() {
        return jobId;
    }

    public JobStatus getJobStatus() {
        return jobStatus;
    }

    public Issue() {
    }

    public Issue(Long appId, Long countryId, Long productionId, Long jobId, JobStatus jobStatus) {
        this.appId = appId;
        this.countryId = countryId;
        this.productionId = productionId;
        this.jobId = jobId;
        this.jobStatus = jobStatus;
    }

}
