package com.ddmonk.demo.service;

import com.ddmonk.demo.demain.Man;
import com.ddmonk.demo.repository.ManRespository;
import org.springframework.beans.factory.annotation.Autowired;

public class GirlService {

    @Autowired
    private ManRespository manRespository;

    public void getAge(Integer id){
        Man man = manRespository.findOne(id);
        if (man.getAge() > 10){
            throw new RuntimeException()
        }
    }
}
