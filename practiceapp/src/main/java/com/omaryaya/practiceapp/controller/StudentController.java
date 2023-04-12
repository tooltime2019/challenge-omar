package com.omaryaya.practiceapp.controller;

import com.omaryaya.practiceapp.model.Student;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController implements StudentAPI {

    @Override
    public Student createStudent(Student student) {
        throw new NotImplementedException("Not implemented yet");
    }

    @Override
    public Student getStudent(String id) {
        throw new NotImplementedException("Not implemented yet");
    }

    @Override
    public List<Student> getAllStudents() {
        throw new NotImplementedException("Not implemented yet");
    }

    @Override
    public Student updateStudent(String id, Student student) {
        throw new NotImplementedException("Not implemented yet");
    }

    @Override
    public void deleteStudent(String id) {
        throw new NotImplementedException("Not implemented yet");
    }
}
