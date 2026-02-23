package com.example.demoAPI.Repositorie;

import com.example.demoAPI.Entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<Students, Long> {
    
}
