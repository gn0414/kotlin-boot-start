package com.simon.kotlinbootstart.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Simon
 */
@RestController
@RequestMapping("/java")
public class JavaHelloController {

    @RequestMapping("hello")
    public String getHello(){
        return "hello java in kotlin-boot-start!!!";
    }
}
