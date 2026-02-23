package com.example.demoAPI.SERVICE.Emol;

import com.example.demoAPI.DTO.StudentDTO;
import com.example.demoAPI.Entity.Students;
import com.example.demoAPI.Repositorie.studentRepository;
import com.example.demoAPI.SERVICE.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class studentServiceEmpl implements StudentService {

    private final studentRepository StudentRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<StudentDTO> getAllStudents() {
        List<Students> students = StudentRepository.findAll();
      return students
                .stream()  // new StudentDTO(student.getId(), student.getName(), student.getEmail()
                .map(student ->modelMapper.map(student, StudentDTO.class))
                .toList();

    }

    @Override
    public StudentDTO getStudentId(Long id) {
        Students student = StudentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student id not found" + id));
       return  modelMapper.map(student, StudentDTO.class);
    }


}
