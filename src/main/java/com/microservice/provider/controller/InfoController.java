package com.microservice.provider.controller;

import com.microservice.provider.domain.Provider;
import com.microservice.provider.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService service;

    @GetMapping("/{state}")
    public Provider getInfoByState(@PathVariable(value = "state") String state){
        return service.getInfoByState(state);
    }
}
