package com.omaryaya.practiceapp.controller;

import com.omaryaya.practiceapp.service.ModelService;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ModelControllerTest {

    @Mock
    private ModelService modelService;

    @BeforeEach
    void setUp() {
        modelService = Mockito.mock(ModelService.class);
        when(modelService.hello()).thenReturn("Hello World!");
    }

    @org.junit.jupiter.api.Test
    void hello() {
        ModelController modelController = new ModelController(modelService);
        assertEquals("Hello World!", modelService.hello());
    }

}