package com.example.demoAPI.Conntroler;

import com.example.demoAPI.DTO.StudentDTO;
import com.example.demoAPI.SERVICE.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;


@GetMapping("/student")
   public List<StudentDTO> getStudents(){
        return studentService.getAllStudents();//arrer Cannot resolve method 'findAll' in 'Repository'
}
@GetMapping("/student/{id}")
public StudentDTO getStudentId(@PathVariable Long id){
   return studentService.getStudentId(id);

}




}
