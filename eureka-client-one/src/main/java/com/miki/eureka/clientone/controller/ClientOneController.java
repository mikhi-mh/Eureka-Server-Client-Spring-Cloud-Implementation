package com.miki.eureka.clientone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

////                 Eureka clients do not have a DASHBOARD like the Eureka server
@RestController
@RequestMapping("/client")
public class ClientOneController {

    @GetMapping("/1/{name}")
    public String getNumber(@PathVariable String name){
        return "This is First Client's Message : Hello, " + name + " welcome to the client-1";
    }
    //          localhost:8762/client/1/Mikhi_MH
}

