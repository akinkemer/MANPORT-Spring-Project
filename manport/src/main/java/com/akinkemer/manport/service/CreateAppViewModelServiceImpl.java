package com.akinkemer.manport.service;

import com.akinkemer.manport.enums.app.*;
import com.akinkemer.manport.view_model.CreateAppViewModel;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CreateAppViewModelServiceImpl implements CreateAppViewModelService {
    @Override
    public CreateAppViewModel getViewModel() {
        CreateAppViewModel model = new CreateAppViewModel();
        model.setBusinessArea(
                Stream.of(BusinessArea.values())
                        .map(BusinessArea::toString)
                        .collect(Collectors.toList())
        );
        model.setBackend(
                Stream.of(Backend.values())
                        .map(Backend::toString)
                        .collect(Collectors.toList())
        );
        model.setDatabase(
                Stream.of(Database.values())
                        .map(Database::toString)
                        .collect(Collectors.toList())
        );
        model.setFrontend(
                Stream.of(Frontend.values())
                        .map(Frontend::toString)
                        .collect(Collectors.toList())
        );
        model.setResponsibleTeam(
                Stream.of(ResponsibleTeam.values())
                        .map(ResponsibleTeam::toString)
                        .collect(Collectors.toList())
        );
        return model;
    }
}
