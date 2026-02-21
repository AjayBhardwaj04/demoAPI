package com.example.demoAPI.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDTO {

    private String name;
    private long id;
    private String email;
// constructor
    public StudentDTO(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

//    public StudentDTO() {
//    }
////Setter method to set Student data
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//// Getter method to get student data
//    public String getEmail() {
//        return email;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public long getId() {
//        return id;
//    }
}
