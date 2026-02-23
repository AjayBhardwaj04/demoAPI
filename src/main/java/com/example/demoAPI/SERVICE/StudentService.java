package com.example.demoAPI.SERVICE;

import com.example.demoAPI.DTO.StudentDTO;

import java.util.List;

public interface StudentService {
    List<StudentDTO> getAllStudents();

    StudentDTO
    getStudentId(Long id);
}
