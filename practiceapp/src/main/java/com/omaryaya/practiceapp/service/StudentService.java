package com.omaryaya.practiceapp.service;

import com.omaryaya.practiceapp.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    Student createStudent(Student student);

    Student getStudent(String id);
    List<Student> getAllStudents();

    Student updateStudent(Student student);

    void deleteStudent(String id);

}
