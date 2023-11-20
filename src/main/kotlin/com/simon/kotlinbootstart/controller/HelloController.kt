package com.simon.kotlinbootstart.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("")
class HelloController {


    @GetMapping("hello")
    fun getHello():String{
        return "hello kotlin-boot!"
    }
}