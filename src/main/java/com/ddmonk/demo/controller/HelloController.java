package com.ddmonk.demo.controller;

import com.ddmonk.demo.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")

public class HelloController {

    @Value("${content}")
    private String content;


    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/hello/{id}", "/hi"}, method = RequestMethod.GET)
    public String say(@PathVariable("id") String id,@RequestParam(value = "test", required = false, defaultValue = "0") String test){
        return "Say hello" + content + girlProperties.getAddress() + " " + id + test;
    }



}
