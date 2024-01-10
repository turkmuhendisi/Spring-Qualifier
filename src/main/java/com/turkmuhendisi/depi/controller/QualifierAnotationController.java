package com.turkmuhendisi.depi.controller;

import com.turkmuhendisi.depi.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QualifierAnotationController {

    @Autowired
    //@Qualifier("WORD")
    private Reader read;

    @Autowired
    @Qualifier("EXCEL")
    private Reader read2;

    @GetMapping("/read")
    public String read() {
        return this.read.readFile() + " + " + this.read2.readFile();
    }
}
