package com.omaryaya.practiceapp.controller;

import com.omaryaya.practiceapp.model.Model;
import com.omaryaya.practiceapp.repository.ModelRepository;
import com.omaryaya.practiceapp.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class ModelController {

    private ModelService modelService;

    @Autowired
    ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping("/hello")
    public String hello() {
        return modelService.hello();
    }
    @GetMapping("/models")
    public List<String> getModels() {
        return modelService.getModels();
    }
}
