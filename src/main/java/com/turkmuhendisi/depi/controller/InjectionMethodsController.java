package com.turkmuhendisi.depi.controller;

import com.turkmuhendisi.depi.FirstClass;
import com.turkmuhendisi.depi.SecondClass;
import com.turkmuhendisi.depi.ThirdClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InjectionMethodsController {

    /*
    Field Injection
    Setter Injection
    Constructor Injection
     */

    //Field Injection
    //@Autowired
    //private FirstClass firstClass;
    private SecondClass secondClass;
    private FirstClass firstClass;
    private ThirdClass thirdClass;

    //Constructor Injection
    public InjectionMethodsController(ThirdClass thirdClass) {
        this.thirdClass = thirdClass;
    }

    @Autowired
    public InjectionMethodsController(FirstClass firstClass,
                                      @Qualifier("thirdClass") ThirdClass thirdClass) {
        this.firstClass = firstClass;
        this.thirdClass = thirdClass;
    }

    @GetMapping("/names")
    public String getNameClasses() {
        return firstClass.getName() + " - " +
                secondClass.getName() + " - " +
                thirdClass.getName();
    }

    //Setter Injection
    @Autowired
    public void setSecondClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }
}
