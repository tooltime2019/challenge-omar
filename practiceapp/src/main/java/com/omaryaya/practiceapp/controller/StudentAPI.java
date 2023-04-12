package com.omaryaya.practiceapp.controller;

import com.omaryaya.practiceapp.model.Student;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Student API")
@RequestMapping("/api/v1/students")
public interface StudentAPI {

    @Operation(summary = "Create a student")
    @PostMapping
    Student createStudent(Student student);

    @Operation(summary = "Get a student by id")
    @GetMapping("/{id}")
    Student getStudent(@PathVariable String id);

    @Operation(summary = "Get all students")
    @GetMapping
    List<Student> getAllStudents();

    @Operation(summary = "Update a student")
    @PutMapping("/{id}")
    Student updateStudent(@PathVariable String id, @RequestBody Student student);

    @Operation(summary = "Delete a student")
    @DeleteMapping("/{id}")
    void deleteStudent(@PathVariable String id);

}
