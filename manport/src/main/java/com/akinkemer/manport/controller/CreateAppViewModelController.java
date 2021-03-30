package com.akinkemer.manport.controller;

import com.akinkemer.manport.service.CreateAppViewModelService;
import com.akinkemer.manport.view_model.CreateAppViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/create-app-view-model")
public class CreateAppViewModelController {
    private final CreateAppViewModelService modelService;

    @Autowired
    public CreateAppViewModelController(CreateAppViewModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping
    public CreateAppViewModel getViewModel() {
        return modelService.getViewModel();
    }
}
