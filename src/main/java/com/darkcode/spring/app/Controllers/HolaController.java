package com.darkcode.spring.app.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HolaController {

    @GetMapping("/mensaje/hola")

    String hola(){
        return "Hola Mundo en SpringBoot";
    }
}
