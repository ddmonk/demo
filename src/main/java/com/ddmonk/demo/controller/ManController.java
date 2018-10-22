package com.ddmonk.demo.controller;
import com.ddmonk.demo.demain.Man;
import com.ddmonk.demo.demain.Result;
import com.ddmonk.demo.repository.ManRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/girls")
public class ManController {

    @Autowired
    private ManRespository manRespository;

    @GetMapping
    public List<Man> listMan(){
        return manRespository.findAll();
    }

    @PostMapping
    public Result<Man> addGirl(@Valid Man man, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        manRespository.save(man);
        return man;
    }

    @GetMapping(value = "{id}")
    public Man findGirl(@PathVariable("id") Integer id){
        return manRespository.findById(id).get();
    }


    @GetMapping(value = "/age/{age}")
    public List<Man> findByAge(@PathVariable("age") Integer age){
        return manRespository.findByAge(age);
    }


}
