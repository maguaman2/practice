package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class Practice {

    @GetMapping()
    fun index():String{
        val age:Int = 18
        return("HOla desde kotlin tegno $age anios")
    }

    @GetMapping("/{age}")
    fun indexAge(@PathVariable age:Long):String{
        //when
        return("HOla desde kotlin tegno $age anios")

    }

}