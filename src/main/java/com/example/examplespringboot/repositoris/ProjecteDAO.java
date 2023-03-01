package com.example.examplespringboot.repositoris;

import com.example.examplespringboot.entitats.Projecte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjecteDAO extends JpaRepository<Projecte, Long> {
    
}
