package com.example.demoAPI.Conntroler;

import com.example.demoAPI.DTO.StudentDTO;
import com.example.demoAPI.Entity.Student;
import com.example.demoAPI.Repositorie.studentRepository;
import com.example.demoAPI.SERVICE.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.JstlUtils;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;


@GetMapping("/student")
   public List<StudentDTO> getStudents(){
        return studentService.getStudents();//arrer Cannot resolve method 'findAll' in 'Repository'
}
@GetMapping("/student/id")
    private List<StudentDTO> getStudentId() {
    return  studentService.getStudents();
}

}
