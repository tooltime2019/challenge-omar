package com.omaryaya.practiceapp.service;

import com.omaryaya.practiceapp.model.Model;
import com.omaryaya.practiceapp.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ModelService {

    @Autowired
    private ModelRepository modelRepository;

    private AtomicInteger counter = new AtomicInteger(0);

    public String hello() {
        modelRepository.save(new Model(counter.incrementAndGet()+"", "Hello World!"));
        return "Hello World!";
    }
    public List<String> getModels() {
        return modelRepository.findAll().stream().map(Model::getName).toList();
    }
}
