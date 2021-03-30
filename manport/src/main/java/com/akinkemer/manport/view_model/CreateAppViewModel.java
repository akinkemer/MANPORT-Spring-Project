package com.akinkemer.manport.view_model;

import com.akinkemer.manport.enums.app.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateAppViewModel {
    private List<String> businessArea;
    private List<String> responsibleTeam;
    private List<String> backend;
    private List<String> frontend;
    private List<String> database;

    public List<String> getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(List<String> businessArea) {
        this.businessArea = businessArea;
    }

    public List<String> getResponsibleTeam() {
        return responsibleTeam;
    }

    public void setResponsibleTeam(List<String> responsibleTeam) {
        this.responsibleTeam = responsibleTeam;
    }

    public List<String> getBackend() {
        return backend;
    }

    public void setBackend(List<String> backend) {
        this.backend = backend;
    }

    public List<String> getFrontend() {
        return frontend;
    }

    public void setFrontend(List<String> frontend) {
        this.frontend = frontend;
    }

    public List<String> getDatabase() {
        return database;
    }

    public void setDatabase(List<String> database) {
        this.database = database;
    }
}
