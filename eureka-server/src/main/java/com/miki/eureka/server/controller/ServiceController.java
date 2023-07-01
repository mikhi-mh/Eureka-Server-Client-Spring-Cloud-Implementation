package com.miki.eureka.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

////            EurekaServer DashBoard ---> http://localhost:8761/

@RequestMapping("/server")
@RestController
public class ServiceController {

    @GetMapping("/{name}")
    public String getMsg(@PathVariable String name){
        return "Hi, " + name + " this is EurekaServer's Controller";
    }
    //              http://localhost:8761/server/Mikhilesh_MH
}
