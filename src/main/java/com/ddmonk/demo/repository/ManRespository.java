package com.ddmonk.demo.repository;

import com.ddmonk.demo.demain.Man;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManRespository extends JpaRepository<Man, Integer> {

    public List<Man> findByAge(Integer age);
}
