package com.turkmuhendisi.depi.controller;

import com.turkmuhendisi.depi.FirstClass;
import com.turkmuhendisi.depi.SecondClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ComponentAndBeanAnotationController {

    @Autowired
    private FirstClass firstClass;
    @Autowired
    private SecondClass secondClass;

    @GetMapping(path = "/first-class")
    public String getNameOfFirstClass() {
        return firstClass.getName();
    }

    @GetMapping(path = "/second-class")
    public String getNameOfSecondClass() {
        return secondClass.getName();
    }
}
